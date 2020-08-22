package com.isaccanedo.health.actuatorexample;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomEndPoint implements Endpoint<String>{
    @Override
    public String getId() {
        return "Isac Canedo";
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public String invoke() {
        return "Hello Isac Canedo";
    }
}
