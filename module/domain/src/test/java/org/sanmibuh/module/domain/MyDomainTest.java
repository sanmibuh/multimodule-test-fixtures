package org.sanmibuh.module.domain;

import org.junit.jupiter.api.Test;

class MyDomainTest {

  @Test
  void should_domain_run() {
    final var name = "ANY";

    final var myProjection = new MyDomain(name);

    assert myProjection.getName().equals(name);
  }
}
