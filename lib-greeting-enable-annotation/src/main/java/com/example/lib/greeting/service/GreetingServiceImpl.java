package com.example.lib.greeting.service;

import com.example.lib.greeting.config.GreetingProperties;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GreetingServiceImpl implements GreetingService {

  private final GreetingProperties greetingProperties;

  @Override
  public String greet() {
    return greetingProperties.getMessage() + " " + greetingProperties.getUsername();
  }
}
