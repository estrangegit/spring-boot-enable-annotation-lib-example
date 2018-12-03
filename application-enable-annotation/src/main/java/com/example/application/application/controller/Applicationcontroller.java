package com.example.application.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.lib.greeting.service.GreetingService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Applicationcontroller {

  private final GreetingService greetingService;

  @GetMapping(path = "/greet")
  public String greet() {
    return greetingService.greet();
  }

}
