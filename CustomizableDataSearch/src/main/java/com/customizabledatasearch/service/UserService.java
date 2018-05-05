package com.customizabledatasearch.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customizabledatasearch.domain.Authority;
import com.customizabledatasearch.domain.User;
import com.customizabledatasearch.repositories.UserRepository;

@Service
public class UserService
{
  @Autowired
  private UserRepository userRepo;
  
  public User saveUser(User user)
  {
    Authority authority = new Authority();
    authority.setAuthority("ROLE_USER");
    authority.setUser(user);
    
    Set<Authority> authorities = new HashSet<>();
    authorities.add(authority);
    
    user.setAuthorities(authorities);
    user = userRepo.save(user);
    
    return user;
  }
}
