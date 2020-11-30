package test.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
		this.fixedInterval = new IntervalBuilder().open(1).open(5).build();
		this.intervalBuilder = new IntervalBuilder();
	}
	
	@Test
	public void givenProveIntervalInsideFixedIntervalThenTrue () {
		this.proveInterval = this.intervalBuilder.open(2).open(4).build();
		assertTrue(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenFixedIntervalInsideProveIntervalThenTrue () {
		this.proveInterval = this.intervalBuilder.open(0).open(6).build();
		assertTrue(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenFixedMinInsideProveIntervalThenTrue () {
		this.proveInterval = this.intervalBuilder.open(0).open(2).build();
		assertTrue(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenFixedMaxInsideProveIntervalThenTrue () {
		this.proveInterval = this.intervalBuilder.open(3).open(6).build();
		assertTrue(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenProveIntervalLowerThanFixedIntervalThenFalse () {
		this.proveInterval = this.intervalBuilder.open(0).open(0.5).build();
		assertFalse(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenProveIntervalGreaterThanFixedIntervalThenFalse () {
		this.proveInterval = this.intervalBuilder.open(6.5).open(7).build();
		assertFalse(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenFixedLowerLimitEqualsProveUpperLimitOpen () {
		this.proveInterval = this.intervalBuilder.open(0.5).open(1).build();
		assertFalse(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenFixedLowerLimitEqualsProveUpperLimitClose () {
		this.proveInterval = this.intervalBuilder.closed(0.5).closed(1).build();
		assertTrue(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenFixedUpperLimitEqualsProveLowerLimitOpen () {
		this.proveInterval = this.intervalBuilder.open(5).open(7).build();
		assertFalse(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void givenFixedUpperLimitEqualsProveLowerLimitClose () {
		this.proveInterval = this.intervalBuilder.closed(5).closed(7).build();
		assertTrue(fixedInterval.isIntersected(proveInterval));
	}
	
	@Test
	public void testIsInInterval() {
		this.proveInterval = this.intervalBuilder.closed(2).closed(4).build();
		assertTrue(proveInterval.isIntersected(fixedInterval));
		assertFalse(fixedInterval.isIntersected(proveInterval));
	}
	
}
