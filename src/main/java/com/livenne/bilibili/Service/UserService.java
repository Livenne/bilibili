package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Override
    public User getUserByUserId(long userId) {
        return null;
    }

    @Override
    public List<Video> getVideoListByUserId(long userId) {
        return List.of();
    }

    @Override
    public List<Video> getCollectionVideoListByUserId(long userId) {
        return List.of();
    }

    @Override
    public List<User> getFollowersByUserId(long userId) {
        return List.of();
    }

    @Override
    public List<User> getFollowingByUserId(long userId) {
        return List.of();
    }

    @Override
    public String getUserNameByUserId(long userId) {
        return "";
    }

    @Override
    public String getPasswordByUserId(long userId) {
        return "";
    }

    @Override
    public String getPhoneNumberByUserId(long userId) {
        return "";
    }

    @Override
    public String getDescriptionByUserId(long userId) {
        return "";
    }

    @Override
    public String getHeadImageUrlByUserId(long userId) {
        return "";
    }

    @Override
    public int getLevelByUserId(long userId) {
        return 0;
    }

    @Override
    public int getXpByUserId(long userId) {
        return 0;
    }

    @Override
    public int getCoinByUserId(long userId) {
        return 0;
    }
}
