package com.example.application.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.lib.greeting.config.EnableServiceGreeting;

@SpringBootApplication
@EnableServiceGreeting
public class Application {

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
