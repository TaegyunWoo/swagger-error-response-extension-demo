package com.example.demo.dto;

import com.example.demo.code.MyEnum1;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RequestDto {
  private String field1;
  private MyEnum1 enumField;
}
