package com.demo.test.ipag.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StatusEnum {

    PENDING("pending"),
    PAID("paid"),
    CANCELED("canceled"),
    REDUNDED("redunded"),
    BLOCKED("blocked");

    private final String statusCode;

    public static StatusEnum getBy(final String code) {
        return StatusEnum.valueOf(code);
    }
}
