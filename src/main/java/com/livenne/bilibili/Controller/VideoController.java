package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Pojo.Video;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/video")
public class VideoController extends BaseController {
    @GetMapping
    public List<Video> getAllVideo() {
        return videoService.getAllVideo();
    }

    @GetMapping("/{id}")
    public Video getVideoById(@PathVariable int id) {
        return videoService.getVideoById(id);
    }

    @PostMapping
    public void addVideo(@RequestBody Video video) {
        videoService.addVideo(video);
    }

    @PutMapping
    public void updateVideo(@RequestBody Video video) {
        videoService.updateVideo(video);
    }

    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable int id) {
        videoService.deleteVideo(id);
    }
}
