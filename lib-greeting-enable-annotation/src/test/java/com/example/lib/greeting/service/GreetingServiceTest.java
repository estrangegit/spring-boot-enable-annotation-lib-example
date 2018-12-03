package com.example.lib.greeting.service;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.lib.greeting.TestApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@TestPropertySource(
    properties = {"service.greeting.message = Hello", "service.greeting.username = toto"})
public class GreetingServiceTest {

  @Autowired
  private GreetingService greetingService;

  @Test
  public void greetTest() {
    assertThat(greetingService.greet()).isEqualTo("Hello toto");
  }
}
