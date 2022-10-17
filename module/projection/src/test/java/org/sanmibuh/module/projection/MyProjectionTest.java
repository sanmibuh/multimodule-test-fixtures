package org.sanmibuh.module.projection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyProjectionTest {

  @Test
  void should_projection_run() {
    final var name = "ANY";

    final var myProjection = new MyProjection(name);

    assertEquals(name, myProjection.getName());
  }

}
