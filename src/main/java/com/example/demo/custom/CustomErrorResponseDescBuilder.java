/**
 * ErrorResponseDescBuilder 커스텀 예시
 * 원본은 io.github.taegyunwoo.swagger.error.appender.service.SimpErrorResponseDescBuilder 참고
 */

package com.example.demo.custom;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.error.response.extension.annotation.ErrorResponse;
import springfox.error.response.extension.service.ErrorResponseDescriptionBuilder;

import java.util.HashMap;
import java.util.Map;

//@Component
//@Primary
public class CustomErrorResponseDescBuilder implements ErrorResponseDescriptionBuilder {

  @Override
  public Map<String, String> buildDescription(ErrorResponse errorResponseAnno) {
    // http 상태코드 당, description 를 저장할 Map
    Map<String, String> descriptionMap = new HashMap<>(); //<HTTP상태코드, 설명>

    descriptionMap.put("404", "This is my custom description");

    return descriptionMap;
  }
}
