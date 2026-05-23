package com.furniro.InventoryService.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Inventory Service")
                        .version("1.0")
                        .description("Inventory Service"))
                .addServersItem(new Server()
                        .url("/api/v1/furniro/inventory-service")
                        .description("Gateway Server"));
    }
}