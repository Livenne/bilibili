package com.livenne.bilibili.Utils;

public class CustomException extends Exception {
    protected Integer code;
    protected String message;

    public CustomException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;

    }
    public CustomException(Integer code, String message) {
        this(code, message, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
