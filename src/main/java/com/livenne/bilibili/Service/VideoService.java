package com.livenne.bilibili.Service;

import com.livenne.bilibili.Pojo.Video;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VideoService {

    List<Video> getAllVideo();

    Video getVideoById(Integer id);

    void addVideo(Video video);

    void updateVideo(Video video);

    void deleteVideo(Integer id);

}
