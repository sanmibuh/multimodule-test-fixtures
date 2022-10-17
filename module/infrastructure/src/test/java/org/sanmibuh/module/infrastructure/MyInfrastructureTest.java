package org.sanmibuh.module.infrastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.sanmibuh.module.domain.MyDomain;
import org.sanmibuh.module.projection.MyProjection;

class MyInfrastructureTest {

  @Test
  void should_infrastructure_run() {
    final var name = "ANY Infra";
    final var projectionName = "ANY projection";
    final var domainName = "ANY domain";

    final var myProjection = new MyProjection(projectionName);
    final var myDomain = new MyDomain(myProjection, domainName);

    final var myInfrastructure = new MyInfrastructure(myDomain, myProjection, name);

    assertEquals(name, myInfrastructure.getName());
    assertEquals(domainName, myInfrastructure.getMyDomain().getName());
    assertEquals(projectionName, myInfrastructure.getMyProjection().getName());
  }

}
