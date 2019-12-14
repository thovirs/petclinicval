package org.springframework.samples.petclinic.owner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OwnerControllerTests.class, PetControllerTests.class, PetTypeFormatterTests.class,
		VisitControllerTests.class })
public class AllTests {

	
	
}
