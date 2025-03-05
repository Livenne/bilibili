package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;
import com.livenne.bilibili.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

}
