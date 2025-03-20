package com.livenne.bilibili.Utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
    public ApiResponse<Void> exception(Exception e) {
        System.out.println("Global Exception Message: " + e.getMessage());
        return ApiResponse.error();
    }

    @ExceptionHandler(value = CustomException.class)
    public ApiResponse<Void> customException(CustomException e) {
        return ApiResponse.fail(e.code, e.message);
    }
}
