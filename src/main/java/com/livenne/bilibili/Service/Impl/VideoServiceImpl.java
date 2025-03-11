package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Pojo.Video;
import com.livenne.bilibili.Service.VideoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class VideoServiceImpl extends BaseService implements VideoService {
    @Override
    public List<Video> getAllVideo() {
        List<Video> videos = new ArrayList<>();
        videoRepository.findAll().forEach(videos::add);
        return videos;
    }

    @Override
    public Video getVideoById(Integer id) {
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
    public void deleteVideo(Integer id) {
        videoRepository.deleteById(id);
    }
}
