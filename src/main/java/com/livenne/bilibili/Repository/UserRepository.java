package com.livenne.bilibili.Repository;

import com.livenne.bilibili.Pojo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
