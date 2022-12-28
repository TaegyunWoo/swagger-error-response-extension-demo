package com.example.demo.config;

import com.example.demo.dto.ErrorResponseDto;
import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class SwaggerConfig {
  @Bean
  public Docket customImplementation(TypeResolver typeResolver){
    return new Docket(DocumentationType.OAS_30)
        .additionalModels(
            typeResolver.resolve(ErrorResponseDto.class)
        )
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
        .build()
        .directModelSubstitute(LocalDate.class, java.sql.Date.class)
        .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
        .apiInfo(apiInfo())
        .tags(
            new Tag("Home", "Home", 1)
        );
  }

  ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("현지야")
        .description("현지야 서버 Application API Document")
        .license("Apache 2.0")
        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
        .termsOfServiceUrl("")
        .version("1.0.0")
        .contact(new Contact("","", "dnxprbs@gmail.com"))
        .build();
  }
}
