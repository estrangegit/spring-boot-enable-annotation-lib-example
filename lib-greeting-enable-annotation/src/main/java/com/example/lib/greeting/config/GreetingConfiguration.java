package com.example.lib.greeting.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.lib.greeting.service.GreetingService;
import com.example.lib.greeting.service.GreetingServiceImpl;

@Configuration
@EnableConfigurationProperties(GreetingProperties.class)
public class GreetingConfiguration {

  @Bean
  public GreetingService greetingService(final GreetingProperties greetingProperties) {
    return new GreetingServiceImpl(greetingProperties);
  }

}
