package org.sanmibuh.module.domain;

import org.sanmibuh.module.projection.MyProjection;

public class MyDomain {

  private final MyProjection myProjection;
  private final String name;

  public MyDomain(final MyProjection myProjection, final String name) {
    this.myProjection = myProjection;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public MyProjection getMyProjection() {
    return myProjection;
  }
}
