package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Repository.CommentRepository;
import com.livenne.bilibili.Repository.UserRepository;
import com.livenne.bilibili.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public VideoRepository videoRepository;
    @Autowired
    public CommentRepository commentRepository;
}
