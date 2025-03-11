package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Pojo.Dto.UserDto;
import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Override
    public List<UserDto> getAllUser() {
        List<UserDto> userDtos = new ArrayList<>();
        userRepository.findAll().forEach(user -> userDtos.add(UserDto.userToDto(user)));
        return userDtos;
    }

    @Override
    public UserDto getUserById(Integer id) {
        return UserDto.userToDto(userRepository.findById(id).orElseThrow());
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
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
