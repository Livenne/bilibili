package com.livenne.bilibili.Service.Impl;

import com.livenne.bilibili.Service.FileStorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FileStorageServiceImpl implements FileStorageService {

    @Value("${resource.files.path}")
    private String filesPath;

    @Override
    public void saveFile(MultipartFile file) throws IOException {
        Path dirPath = Paths.get(filesPath);
        if (!Files.exists(dirPath)) {
            Files.createDirectories(dirPath);
        }
        String fileName = UUID.randomUUID() + "-" + file.getOriginalFilename();
        Path newPath =  dirPath.resolve(fileName);
        Files.copy(file.getInputStream(), newPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(newPath);
    }

    @Override
    public Resource loadFile(String fileName) throws MalformedURLException {
        Path dirPath = Paths.get(filesPath);
        Path filePath = dirPath.resolve(fileName);
        Resource resource = new UrlResource(filePath.toUri());
        if (resource.exists() || resource.isReadable()) {
            return resource;
        }
        return null;
    }
}
