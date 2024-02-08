package com.spondias.Authentication.repository;

import com.spondias.Authentication.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByPhoneNumber(String phoneNumber);

    Optional<AppUser> findById(Long id);

    Optional<AppUser> findAppUserById(Long userId);
}
