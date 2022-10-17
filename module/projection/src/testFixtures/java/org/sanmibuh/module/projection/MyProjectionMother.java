package org.sanmibuh.module.projection;

public class MyProjectionMother {

  public static MyProjection withName(final String name) {
    return new MyProjection(name);
  }

}
