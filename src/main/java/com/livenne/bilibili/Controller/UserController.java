package com.livenne.bilibili.Controller;

import com.livenne.bilibili.Pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController {

    @PostMapping
    public User addUser(@RequestBody User user) {
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }


    // There is currently no hidden password!!!
    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
