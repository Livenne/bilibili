package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Service.UserAccountService;
import com.livenne.bilibili.Utils.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl extends BaseService implements UserAccountService {
    @Override
    public ApiResponse<Void> register(String username, String password, String confirmPassword) {
        return null;
    }

    @Override
    public ApiResponse<Void> login(String username, String password) {
        return null;
    }

    @Override
    public ApiResponse<Void> logout() {
        return null;
    }
}
