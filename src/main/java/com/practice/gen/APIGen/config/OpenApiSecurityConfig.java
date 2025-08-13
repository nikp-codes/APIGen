package com.practice.gen.APIGen.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

import java.util.List;

/**
 * @author Nikhil
 * @since 2025-08-11 Created
 */
@Configuration
@SecurityScheme(
        name = "access_token",
        type = SecuritySchemeType.APIKEY,
        in = SecuritySchemeIn.HEADER,
        scheme = "bearer",
        bearerFormat = "JWT"
)
@SecurityScheme(
        name = "device_token",
        type = SecuritySchemeType.APIKEY,
        in = SecuritySchemeIn.HEADER
)
public class OpenApiSecurityConfig {
    @Bean
    public OpenApiCustomizer globalHeaderCustomizer() {
        return openApi -> {
            Schema<Object> lang = new Schema<>();
            lang.setType("string");
            lang.setEnum(List.of("hi", "ja", "zh-CN", "hi"));
            lang.setDefault("en");
            List<Parameter> globalHeaders = List.of(
                    new Parameter()
                            .in("header")
                            .name(HttpHeaders.ACCEPT_LANGUAGE)
                            .required(true)
                            .schema(lang),
                    new Parameter()
                            .in("header")
                            .name("X-Another-Header")
                            .description("Another global header")
                            .required(false)
                            .schema(new StringSchema())
            );

            if (openApi.getPaths() != null) {
                openApi.getPaths().values().forEach(pathItem ->
                        pathItem.readOperations().forEach(operation ->
                                globalHeaders.forEach(operation::addParametersItem)
                        )
                );
            }
        };
    }
}
