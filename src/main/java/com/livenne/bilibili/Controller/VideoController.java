package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Pojo.Video;
import com.livenne.bilibili.Utils.ApiResponse;
import com.livenne.bilibili.Utils.CustomException;
import com.livenne.bilibili.Utils.ResponseCode;
import jdk.swing.interop.SwingInterOpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/video")
public class VideoController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(VideoController.class);

    @GetMapping
    public ApiResponse<List<Video>> getAllVideo() {
        return ApiResponse.success(videoService.getAllVideo());
    }

    @GetMapping("/{id}")
    public ApiResponse<Video> getVideoById(@PathVariable int id) {
        return ApiResponse.success(videoService.getVideoById(id));
    }

    @PostMapping
    public ApiResponse<Void> addVideo(@RequestParam MultipartFile video ,
                                      @RequestParam MultipartFile cover,
                                      @RequestParam Integer authorId,
                                      @RequestParam String title,
                                      @RequestParam String description,
                                      @RequestParam String releaseTime) {
        String videoName = "", coverName = "";

        System.out.println(title);
        System.out.println(description);

        try {
             videoName = fileStorageService.saveFile(video);
             coverName = fileStorageService.saveFile(cover);
        } catch (IOException e) {
            return ApiResponse.error();
        }
        Video v = new Video();
        v.setTitle(title);
        v.setDescription(description);
        v.setAuthorId(authorId);
        v.setVideoUrl(videoName);
        v.setCoverUrl(coverName);
        v.setReleaseTime(releaseTime);
        videoService.addVideo(v);
        return ApiResponse.success();

    }

    @PutMapping
    public ApiResponse<Void> updateVideo(@RequestBody Video video) {
        videoService.updateVideo(video);
        return ApiResponse.success();
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteVideo(@PathVariable int id) {
        try {
            fileStorageService.deleteFile(videoService.getVideoById(id).getVideoUrl());
        } catch (IOException e) {
            return ApiResponse.error();
        }
        videoService.deleteVideo(id);
        return ApiResponse.success();
    }

}
