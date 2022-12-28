package com.example.demo.code;

import org.springframework.http.HttpStatus;
import springfox.error.response.extension.service.ErrorEnumInfo;

public enum MyEnum1 implements ErrorEnumInfo {
  AAA(HttpStatus.valueOf(400), "aaa"), BBB(HttpStatus.valueOf(401), "bbb"),
  CCC(HttpStatus.valueOf(400), "ccc"), DDD(HttpStatus.valueOf(401), "ddd"),
  EEE(HttpStatus.valueOf(402), "eee"), FFF(HttpStatus.valueOf(408), "fff");

  private HttpStatus code;
  private String description;

  MyEnum1(HttpStatus code, String description) {
    this.code = code;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public HttpStatus getCode() {
    return code;
  }
}
