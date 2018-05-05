package com.customizabledatasearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customizabledatasearch.domain.User;

public interface UserRepository extends JpaRepository<User, Long>
{
  User findByUsername (String username);
}
