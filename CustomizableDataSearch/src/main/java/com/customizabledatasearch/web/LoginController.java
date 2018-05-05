package com.customizabledatasearch.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.customizabledatasearch.domain.User;

@Controller
public class LoginController
{
  
  //spring security is automatically doing the post method so only write out the Get method
  //login html has the post form - i copy/past it from hovering over loginPage in SecurityConfig object
  @RequestMapping(value="/login", method=RequestMethod.GET)
  public String getLogin (ModelMap model)
  {
    User user = new User();
    model.put("user", user);
    
    return "login";
  }
  
}
