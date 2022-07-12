package com.recommendation.RecomendationApi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.util.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
	            .apis(RequestHandlerSelectors.basePackage("com.recommendation.RecomendationApi"))
	            .paths(PathSelectors.any()).build();
	}

}
