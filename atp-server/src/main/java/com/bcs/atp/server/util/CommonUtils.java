package com.bcs.atp.server.util;

import javax.xml.bind.DatatypeConverter;
import java.security.SecureRandom;

public class CommonUtils {
    /**
     * Generate a hashed valued for analytics
     * @returns Generated hashed value
     */
    public static String generateAnalyticsUserId() {
        SecureRandom random = new SecureRandom();
        byte[] randomBytes = new byte[20];
        random.nextBytes(randomBytes);
        String hashedUserID = DatatypeConverter.printHexBinary(randomBytes);
        return hashedUserID.toLowerCase();  // Convert to lowercase to match the behavior in the TypeScript example.
    }
}
