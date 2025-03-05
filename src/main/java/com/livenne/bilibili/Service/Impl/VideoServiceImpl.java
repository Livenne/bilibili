package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Pojo.Comment;
import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;
import com.livenne.bilibili.Service.VideoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl extends BaseService implements VideoService {

    @Override
    public Video getVideoById(long id) {
        return videoRepository.findById(id).orElseThrow();
    }

    @Override
    public void addVideo(Video video) {
        videoRepository.save(video);
    }

    @Override
    public void updateVideo(Video video) {
        videoRepository.save(video);
    }

    @Override
    public void deleteVideo(long id) {
        videoRepository.deleteById(id);
    }

}
