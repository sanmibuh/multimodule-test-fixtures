package org.sanmibuh.infrastructure.app;

import org.sanmibuh.module.domain.MyDomain;
import org.sanmibuh.module.infrastructure.MyInfrastructure;
import org.sanmibuh.module.projection.MyProjection;

public class App {

  private final MyInfrastructure myInfrastructure;

  public static void main(String[] args) {
    System.out.println("APP");
    new App();
  }

  public App() {
    final var app = this.myInfrastructure = new MyInfrastructure(
        new MyDomain(new MyProjection("Proj1"), "Domain"),
        new MyProjection("Proj2"),
        "INfra"
    );

    System.out.println(app);
  }

  public MyInfrastructure getMyInfrastructure() {
    return myInfrastructure;
  }

  @Override
  public String toString() {
    return "App{" +
        "myInfrastructure=" + myInfrastructure +
        '}';
  }
}
