package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;

import java.util.List;

public interface IUserService {
    User getUserByUserId(long userId);
    List<Video> getVideoListByUserId(long userId);
    List<Video> getCollectionVideoListByUserId(long userId);
    List<User> getFollowersByUserId(long userId);
    List<User> getFollowingByUserId(long userId);
    String getUserNameByUserId(long userId);
    String getPasswordByUserId(long userId);
    String getPhoneNumberByUserId(long userId);
    String getDescriptionByUserId(long userId);
    String getHeadImageUrlByUserId(long userId);
    int getLevelByUserId(long userId);
    int getXpByUserId(long userId);
    int getCoinByUserId(long userId);
}
