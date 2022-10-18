package multimodule.test.fixtures.app;

import org.sanmibuh.module.infrastructure.MyInfrastructure;
import org.sanmibuh.module.infrastructure.MyInfrastructureMother;

public class AppFixtures {

  public static MyInfrastructure infra() {
    return MyInfrastructureMother.withName("INfra", "Domain", "Proj2");
  }

}
