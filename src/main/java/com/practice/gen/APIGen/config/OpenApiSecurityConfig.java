package com.practice.gen.APIGen.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
            Paths paths = openApi.getPaths();
            if (paths != null) {
                for (PathItem pathItem : paths.values()) {
                    for (Operation operation : pathItem.readOperations()) {
                        Parameter headerParam = new Parameter()
                                .in("header")
                                .name("X-Custom-Header")
                                .description("Global custom header added to all operations")
                                .required(true)
                                .schema(new StringSchema());
                        operation.addParametersItem(headerParam);
                    }
                }
            }
        };
    }
}
