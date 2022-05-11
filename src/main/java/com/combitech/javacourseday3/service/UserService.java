package com.combitech.javacourseday3.service;

import com.combitech.javacourseday3.repository.UserRepository;
import com.combitech.javacourseday3.user.UserDTO;
import com.combitech.javacourseday3.user.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO getUser(long id) {
        UserEntity userEntity = userRepository.getById(id);
        return userEntity.toDto();
    }

    public List<UserDTO> getUsers(){
        List<UserEntity> userEntities = userRepository.findAll();
        return entitiesToDtos(userEntities);
    }

    public List<UserDTO> getActiveUsers(){
        List<UserEntity> userEntities = userRepository.getAllActiveUsers();
        return entitiesToDtos(userEntities);
    }

    public UserDTO createUser(UserDTO userDTO){
        UserEntity userEntity = new UserEntity(userDTO.getName(), userDTO.isActive());
        userRepository.save(userEntity);
        return userEntity.toDto();
    }

    private List<UserDTO> entitiesToDtos(List<UserEntity> userEntities) {
        return userEntities.stream()
                .map(userEntity -> userEntity.toDto())
                .toList();
    }

}
