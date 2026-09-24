package com.CodeForge.CodeForgeV1.repository;

import com.CodeForge.CodeForgeV1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
