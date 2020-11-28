package test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
	BuilderIntervalTest.class,	
	ClosedMaxTest.class,	
	ClosedMinTest.class,	
	IntervalTest.class,	
	MaxTest.class,	
	MinTest.class,	
	Point.class,	
})

public class AllTest {
	
}
