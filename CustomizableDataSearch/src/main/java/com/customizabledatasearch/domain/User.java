package com.customizabledatasearch.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User
{
  private Long id;
  private String username;
  private String password;
  
  private Userint userint;
  
  //security
  private Set<Authority> authorities = new HashSet<>();
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  public Long getId()
  {
    return id;
  }
  public void setId(Long id)
  {
    this.id = id;
  }
  public String getUsername()
  {
    return username;
  }
  public void setUsername(String username)
  {
    this.username = username;
  }
  public String getPassword()
  {
    return password;
  }
  public void setPassword(String password)
  {
    this.password = password;
  } 
  
  @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user", optional= false)
  public Userint getUserint() {
	  return userint;
  }
  public void setUserint(Userint userint) {
	  this.userint = userint;
  }
  
  //security 
  @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="user")
  public Set<Authority> getAuthorities()
  {
    return authorities;
  }

public void setAuthorities(Set<Authority> authorities)
  {
    this.authorities = authorities;
  }

}