package de.scriptsdk.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ScriptSdkConfig {

    @Value("${scriptsdk.port}")
    private int servicePort;
    @Value("${scriptsdk.url}")
    private String serviceUrl;

    public int getServicePort() {
        return servicePort;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }
}
