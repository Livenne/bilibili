package com.livenne.bilibili.Utils;

public enum ResponseCode {

    SUCCESS(200, "success"),
    FAILURE(400, "failure"),
    ERROR(500, "error"),
    PARAM_ERROR(1000, "param error"),
    INVALID_TOKEN(1001, "invalid token"),
    ACCESS_DENIED(1002, "access denied"),
    USERNAME_OR_PASSWORD_ERROR(1003, "username or password error");

    private final int code;

    private final String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
