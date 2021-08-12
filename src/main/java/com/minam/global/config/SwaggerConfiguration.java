package com.minam.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @since       2021.08.12
 * @author      minam
 * @description Swagger Configuration
 **********************************************************************************************************************/
@Configuration
@EnableSwagger2
@Profile({"default", "dev", "test"})
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.minam.space"))
                .paths(PathSelectors.ant("/api/**"))
                .build();
    }
}