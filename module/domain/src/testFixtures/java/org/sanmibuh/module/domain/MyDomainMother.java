package org.sanmibuh.module.domain;

import org.sanmibuh.module.projection.MyProjectionMother;

public class MyDomainMother {

  public static MyDomain withName(final String domainName, final String projectionName) {
    return new MyDomain(MyProjectionMother.withName(projectionName), domainName);
  }

}
