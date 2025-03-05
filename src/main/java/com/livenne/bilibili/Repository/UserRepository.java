package com.livenne.bilibili.Repository;

import com.livenne.bilibili.Pojo.User;
import com.livenne.bilibili.Pojo.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
