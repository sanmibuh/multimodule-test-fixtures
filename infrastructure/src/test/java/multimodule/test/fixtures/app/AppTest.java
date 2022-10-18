package multimodule.test.fixtures.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void should_app() {
    final var app = new App();

    final var expectedIfra = AppFixtures.infra();

    assertEquals(expectedIfra.getName(), app.getMyInfrastructure().getName());
    final var myDomain = "Domain";
    assertEquals(expectedIfra.getMyDomain().getName(), app.getMyInfrastructure().getMyDomain().getName());
    final var myProjection = "Proj2";
    assertEquals(expectedIfra.getMyProjection().getName(), app.getMyInfrastructure().getMyProjection().getName());
  }

}
