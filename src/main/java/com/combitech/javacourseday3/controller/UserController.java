package com.combitech.javacourseday3.controller;

import com.combitech.javacourseday3.repository.UserRepository;
import com.combitech.javacourseday3.user.UserDTO;
import com.combitech.javacourseday3.user.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable("id") long id) {
        UserEntity userEntity = userRepository.getById(id);
        return userEntity.toDto();
    }

}
