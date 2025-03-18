package com.livenne.bilibili.Service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;

@Service
public interface FileStorageService {
    void saveFile(MultipartFile file) throws IOException;
    Resource loadFile(String filename) throws MalformedURLException;
}
