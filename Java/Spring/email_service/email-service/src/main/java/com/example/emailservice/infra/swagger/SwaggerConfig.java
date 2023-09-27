package com.example.emailservice.infra.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI swaggerConfigApi() {
        return new OpenAPI()
                .info( new Info()
                        .title("Email Service API")
                        .description("Amazon SES Email Service API")
                        .version("1.0.0"));
    }
}
