package com.huuanh.demo.rsa.viewmodel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserLoginRequest {

  @NotEmpty
  @javax.validation.constraints.Email
  @Size(max = 255)
  private String email;

  @NotEmpty
  @Size(min = 6, max = 32)
  private String password;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
