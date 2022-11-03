package de.scriptsdk.web.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI springOpenAPI(@Value("/$spring.application.name") String contextPath) {
        return new OpenAPI().addServersItem(new Server().url(contextPath)).
                info(new Info().title("ScriptSDK web service").
                        description("Webservice exposing Rest-API for communication between service and stealth client").
                        version("1.0.0").
                        contact(new Contact().name("Crome696").url("https://github.com/stealth-scriptsdk")));
    }
}
