package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Service.CommentService;
import com.livenne.bilibili.Service.FileStorageService;
import com.livenne.bilibili.Service.Impl.FileStorageServiceImpl;
import com.livenne.bilibili.Service.UserService;
import com.livenne.bilibili.Service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BaseController {
    @Autowired
    public UserService userService;

    @Autowired
    public VideoService videoService;

    @Autowired
    public CommentService commentService;

    @Autowired
    public FileStorageService fileStorageService;
}
