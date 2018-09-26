package steps;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	BaseSteps bs = new BaseSteps();
@Before
public void beforeFunction() throws IOException {
	bs.initiateDriver();
}

@After
public void afterFunction() {
	System.out.println("tear down function");
	bs.tearDown();
}
}
