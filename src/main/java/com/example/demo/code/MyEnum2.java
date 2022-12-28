package com.example.demo.code;

import org.springframework.http.HttpStatus;
import springfox.error.response.extension.service.ErrorEnumInfo;

public enum MyEnum2 implements ErrorEnumInfo {
  ZZZ(HttpStatus.valueOf(400), "zzz"), XXX(HttpStatus.valueOf(404), "xxx"),
  YYY(HttpStatus.valueOf(403), "yyy"), UUU(HttpStatus.valueOf(400), "uuu");
  private HttpStatus code;
  private String description;

  MyEnum2(HttpStatus code, String description) {
    this.code = code;
    this.description = description;
  }


  @Override
  public HttpStatus getCode() {
    return code;
  }

  @Override
  public String getDescription() {
    return description;
  }
}
