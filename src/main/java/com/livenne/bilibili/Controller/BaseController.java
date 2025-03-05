package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Service.CommentService;
import com.livenne.bilibili.Service.UserService;
import com.livenne.bilibili.Service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
    @Autowired
    protected UserService userService;
    @Autowired
    protected VideoService videoService;
    @Autowired
    protected CommentService commentService;
}
