package de.scriptsdk.web.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AfterServerHasBeenInitializedEvent {

    @EventListener
    public void onApplicationEvent(final ServletWebServerInitializedEvent event) {

        int port = event.getWebServer().getPort();

        log.info(" ");
        log.info("-----------------------------------------------------");
        log.info(String.format("OpenApi-Documentation : http://localhost:%s/openapi", port));
        log.info(String.format("OpenApi-Json          : http://localhost:%s/v3/api-docs", port));
        log.info("-----------------------------------------------------");
        log.info(" ");
    }
}
