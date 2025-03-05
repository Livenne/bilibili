package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;

import java.util.List;

public interface VideoService {
    Video getVideoById(long id);
    void addVideo(Video video);
    void updateVideo(Video video);
    void deleteVideo(long id);
}
