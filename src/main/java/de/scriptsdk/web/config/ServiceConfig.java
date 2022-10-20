package de.scriptsdk.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceConfig {
    @Value("${server.port}")
    private int serverPort;

    public int getServerPort() {
        return serverPort;
    }
}
