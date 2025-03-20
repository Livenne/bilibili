package com.livenne.bilibili.Service;

import com.livenne.bilibili.Utils.ApiResponse;
import com.livenne.bilibili.Utils.CustomException;
import org.springframework.stereotype.Service;

@Service
public interface UserAccountService {
    ApiResponse<Void> register(String username, String password, String confirmPassword);
    ApiResponse<Void> login(String username, String password);
    ApiResponse<Void> logout();
}
