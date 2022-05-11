package com.combitech.javacourseday3.repository;

import com.combitech.javacourseday3.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    @Query(value = "SELECT * FROM USERS WHERE active IS TRUE", nativeQuery = true)
    List<UserEntity> getAllActiveUsers();
}
