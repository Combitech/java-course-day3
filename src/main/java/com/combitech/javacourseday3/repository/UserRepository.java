package com.combitech.javacourseday3.repository;

import com.combitech.javacourseday3.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
