package org.sanmibuh.module.infrastructure;

import org.sanmibuh.module.domain.MyDomain;
import org.sanmibuh.module.projection.MyProjection;

public class MyInfrastructure {

  private final MyDomain myDomain;
  private final MyProjection myProjection;
  private final String name;

  public MyInfrastructure(final MyDomain myDomain, final MyProjection myProjection, final String name) {
    this.myDomain = myDomain;
    this.myProjection = myProjection;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public MyDomain getMyDomain() {
    return myDomain;
  }

  public MyProjection getMyProjection() {
    return myProjection;
  }
}
