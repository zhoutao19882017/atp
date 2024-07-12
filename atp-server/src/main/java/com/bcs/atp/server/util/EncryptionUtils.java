package com.bcs.atp.server.util;

import lombok.extern.log4j.Log4j2;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 加解密工具类
 *
 * @author scott
 */
@Log4j2
@Component
public class EncryptionUtils {
	@Value("${server.encryption.key}")
	private String encryptKey;
	@Value("${server.encryption.iv}")
	private String encryptIV;

	/***
	 * 加密
	 * @param  data 要加密的数据
	 * @return 加密后的数据
	 */
	public String encrypt(String data) {
		return encrypt(data, encryptKey, encryptIV);
	}

	/**
	 * 解密
	 *
	 * @param data 需要解密的数据
	 * @return 解密后的明文
	 */
	public String decrypt(String data) {
		return decrypt(data, encryptKey, encryptIV);
	}

	/**
	 * 加密方法
	 *
	 * @param data 要加密的数据
	 * @param key  加密key
	 * @param iv   加密iv
	 * @return 加密的结果
	 */
	private static String encrypt(String data, String key, String iv) {
		try {
			// "算法/模式/补码方式" NoPadding PkcsPadding
			Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
			int blockSize = cipher.getBlockSize();

			byte[] dataBytes = data.getBytes();
			int plaintextLength = dataBytes.length;
			if (plaintextLength % blockSize != 0) {
				plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
			}

			byte[] plaintext = new byte[plaintextLength];
			System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);

			SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());

			cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
			byte[] encrypted = cipher.doFinal(plaintext);
			return new Base64().encodeToString(encrypted);
		} catch (Exception e) {
			log.error("failed to encrypt str " + data, e);
			return null;
		}
	}

	/**
	 * 解密方法
	 *
	 * @param data 要解密的数据
	 * @param key  解密key
	 * @param iv   解密iv
	 * @return 解密的结果
	 */
	private static String decrypt(String data, String key, String iv) {
		try {
			byte[] encrypted = new Base64().decode(data);
			Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
			SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
			byte[] original = cipher.doFinal(encrypted);
			return new String(original).trim();
		} catch (Exception e) {
			log.error("failed to decrypt str " + data, e);
			return null;
		}
	}
}
