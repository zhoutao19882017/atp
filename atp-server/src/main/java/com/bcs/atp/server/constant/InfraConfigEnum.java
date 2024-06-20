package com.bcs.atp.server.constant;

import lombok.Getter;

@Getter
public enum InfraConfigEnum {
    MAILER_SMTP_URL("MAILER_SMTP_URL"),
    MAILER_ADDRESS_FROM("MAILER_ADDRESS_FROM"),
    VITE_ALLOWED_AUTH_PROVIDERS("VITE_ALLOWED_AUTH_PROVIDERS"),
    ALLOW_ANALYTICS_COLLECTION("ALLOW_ANALYTICS_COLLECTION"),
    ANALYTICS_USER_ID("ANALYTICS_USER_ID"),
    IS_FIRST_TIME_INFRA_SETUP("IS_FIRST_TIME_INFRA_SETUP");

    private final String value;

    private InfraConfigEnum(String value) {
        this.value = value;
    }
}
