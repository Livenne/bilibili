package com.livenne.bilibili.Repository;

import com.livenne.bilibili.Pojo.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {
}
