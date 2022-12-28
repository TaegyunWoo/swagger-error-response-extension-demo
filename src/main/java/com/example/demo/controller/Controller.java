package com.example.demo.controller;

import com.example.demo.code.LoginErrorCode;
import com.example.demo.dto.ErrorResponseDto;
import com.example.demo.dto.RequestDto;
import com.example.demo.dto.ResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.error.response.extension.annotation.ErrorResponse;

@RequestMapping("/home")
@RestController
public class Controller {

  @Operation(tags = {"Home"})
  @ErrorResponse(errorEnums = {LoginErrorCode.class}, content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class)))
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "success", content = @Content(mediaType = "application/json")),
  })
  @GetMapping()
  ResponseDto home(
      @Parameter(in = ParameterIn.DEFAULT, description = "My DTO", required = true) @RequestBody RequestDto requestDto
  ) {
    return new ResponseDto();
  }
}
