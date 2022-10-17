package org.sanmibuh.module.infrastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyInfrastructureTest {

  @Test
  void should_infrastructure_run() {
    final var name = "ANY";

    final var myInfrastructure = new MyInfrastructure(name);

    assertEquals(name, myInfrastructure.getName());
  }

}
