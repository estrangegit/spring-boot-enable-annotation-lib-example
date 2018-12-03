package com.example.application.application.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.application.application.integration.test.commons.AbstractTestIntegration;

public class ApplicationControllerTestIT extends AbstractTestIntegration {

  @Test
  public void testGreet() {

    final String url = "/greet";

    // @formatter:off
    final ResponseEntity<String> response = restTemplate.exchange(url,
                                                                  HttpMethod.GET, null,
                                                                  new ParameterizedTypeReference<String>(){}
                                                                  );
    // @formatter:on

    final String greeting = response.getBody();

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(greeting).isEqualTo("Hello toto");
  }
}
