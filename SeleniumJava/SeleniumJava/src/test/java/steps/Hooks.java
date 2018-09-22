package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BaseSteps bs = new BaseSteps();
@Before
public void beforeFunction() {
	bs.initiateDriver();
}

@After
public void afterFunction() {
	System.out.println("tear down function");
	bs.tearDown();
}
}
