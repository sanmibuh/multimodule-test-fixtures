package org.sanmibuh.module.infrastructure;

import org.sanmibuh.module.domain.MyDomainMother;
import org.sanmibuh.module.projection.MyProjectionMother;

public class MyInfrastructureMother {

  public static MyInfrastructure withName(
      final String infraName,
      final String domainName,
      final String projectionName
  ) {
    return new MyInfrastructure(
        MyDomainMother.withName(domainName, projectionName),
        MyProjectionMother.withName(projectionName),
        infraName
    );
  }

}
