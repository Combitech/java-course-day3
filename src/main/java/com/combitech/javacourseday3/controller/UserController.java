package com.combitech.javacourseday3.controller;

import com.combitech.javacourseday3.repository.UserRepository;
import com.combitech.javacourseday3.service.UserService;
import com.combitech.javacourseday3.user.UserDTO;
import com.combitech.javacourseday3.user.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable("id") long id) {
        return userService.getUser(id);
    }

    @GetMapping
    public List<UserDTO> getUsers(){
        return userService.getUsers();
    }

}
