package com.bcs.atp.server.util;

import com.soulcraft.utils.email.IEmailSender;
import com.soulcraft.utils.email.bean.EmailInfo;
import com.soulcraft.utils.email.exception.MailSendException;
import com.soulcraft.utils.email.impl.EmailSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 发送电子邮件工具类
 *
 * @author scott
 * @since 2024/04/02
 */
@Component
@Slf4j
public class EmailSenderUtils {
  // 发送邮件的服务器的IP和端口
  @Value("${email.smtp.host}")
  private String smtpHost;
  @Value("${email.smtp.port}")
  private String smtpPort;
  @Value("${email.smtp.needsValidate}")
  private boolean needsValidate;
  @Value("${email.sender.email}")
  private String senderEmail;
  @Value("${email.sender.password}")
  private String senderPassword;
  @Value("${email.sender.name}")
  private String senderName;
  private final IEmailSender emailSender;

  public EmailSenderUtils() {
    emailSender = new EmailSender();
  }

  /**
   * 以HTML格式发送邮件
   *
   * @param mailInfo 待发送的邮件信息
   */
  public void sendEmail(EmailInfo mailInfo) throws MailSendException {
    emailSender.send(smtpHost, parseServerPort(), needsValidate,
      senderEmail, senderName, senderPassword, mailInfo);
  }

  private int parseServerPort() {
    int port;
    try {
      port = Integer.parseInt(smtpPort);
    } catch (NumberFormatException e) {
      port = 25;
    }
    return port;
  }
}
