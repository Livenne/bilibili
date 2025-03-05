package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Pojo.Video;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/video")
public class VideoController extends BaseController {

    @PostMapping
    public void add(@RequestBody Video video) {
        videoService.addVideo(video);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        videoService.deleteVideo(id);
    }

    @PutMapping
    public void update(@RequestBody Video video) {
        videoService.updateVideo(video);
    }

    @GetMapping("/{id}")
    public Video get(@PathVariable int id) {
        return videoService.getVideoById(id);
    }
}
