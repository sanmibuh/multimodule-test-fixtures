package multimodule.test.fixtures.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void should_app() {
    final var app = new App();

    final var myInfra = "INfra";
    assertEquals(myInfra, app.getMyInfrastructure().getName());
    final var myDomain = "Domain";
    assertEquals(myDomain, app.getMyInfrastructure().getMyDomain().getName());
    final var myProjection = "Proj2";
    assertEquals(myProjection, app.getMyInfrastructure().getMyProjection().getName());
  }

}
