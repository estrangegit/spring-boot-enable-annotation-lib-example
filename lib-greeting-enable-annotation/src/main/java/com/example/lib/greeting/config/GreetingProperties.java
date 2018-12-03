package com.example.lib.greeting.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "service.greeting")
public class GreetingProperties {

  public String message;

  private String username;
}
