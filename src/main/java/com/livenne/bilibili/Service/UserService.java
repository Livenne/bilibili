package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Dto.UserDto;
import com.livenne.bilibili.Pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> getAllUser();

    UserDto getUserById(Integer id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);

}
