package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;

import java.util.List;

public interface UserService {
    User getUserById(long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);
}
