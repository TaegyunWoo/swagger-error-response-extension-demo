package com.example.demo.code;

import org.springframework.http.HttpStatus;
import springfox.error.response.extension.service.ErrorEnumInfo;

public enum LoginErrorCode implements ErrorEnumInfo {
  WRONG_ID(HttpStatus.valueOf(401), "account id is wrong."),
  WRONG_PW(HttpStatus.valueOf(401), "password is wrong.");
  private HttpStatus code;
  private String description;

  LoginErrorCode(HttpStatus code, String description) {
    this.code = code;
    this.description = description;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public HttpStatus getCode() {
    return code;
  }
}
