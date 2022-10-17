package org.sanmibuh.module.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyDomainTest {

  @Test
  void should_domain_run() {
    final var domainName = "ANY domain";
    final var projectionName = "ANY projection";

    final var myDomain = MyDomainMother.withName(domainName, projectionName);

    assertEquals(domainName, myDomain.getName());
    assertEquals(projectionName, myDomain.getMyProjection().getName());
  }
}
