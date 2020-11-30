package test.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Interval;
import main.IntervalBuilder;

public class IntersectionTest {

	private Interval fixedInterval;
	private Interval proveInterval;
	private IntervalBuilder intervalBuilder;
	
	@BeforeEach
	public void before(){
		this.intervalBuilder = new IntervalBuilder();
		this.fixedInterval = this.intervalBuilder.open(1).open(5).build();
	}
	
	@Test
	public void givenTwoLimitsInsideFixedIntervalThenTrue () {
		this.proveInterval = this.intervalBuilder.open(2).open(4).build();
		assertTrue(fixedInterval.isIntersected(proveInterval));
	}
	
}
