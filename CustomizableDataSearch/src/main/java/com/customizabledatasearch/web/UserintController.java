package com.customizabledatasearch.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/userint")
public class UserintController
{
  
  @RequestMapping(value="", method=RequestMethod.GET)
  public String getUserint(ModelMap model)
  {
    return "userint";
  }

}