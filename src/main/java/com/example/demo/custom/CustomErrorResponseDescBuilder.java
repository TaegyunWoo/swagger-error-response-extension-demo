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

@Component
@Primary
public class CustomErrorResponseDescBuilder implements ErrorResponseDescriptionBuilder {

  @Override
  public Map<String, String> buildDescription(ErrorResponse errorResponseAnno) {
    // map to save description per http status
    Map<String, String> descriptionMap = new HashMap<>(); //<HTTP Status, Description>

    descriptionMap.put("404", "This is my custom description");

    return descriptionMap;
  }
}
