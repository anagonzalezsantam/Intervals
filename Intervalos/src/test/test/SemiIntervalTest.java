package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.OpenLowerSemiInterval;
import main.OpenUpperSemiInterval;
import main.SemiInterval;

public class SemiIntervalTest {

	public SemiInterval semiInterval;
	
	@Test
	public void testCreateSemiInterval() {
		semiInterval = new OpenLowerSemiInterval(5.5);
		assertEquals("5.5)", semiInterval.toString());
		semiInterval = new OpenUpperSemiInterval(5.5);
		assertEquals("(5.5", semiInterval.toString());
	}
	
	@Test
	public void testEqualsSemiInterval() {
		semiInterval = new OpenLowerSemiInterval(5.5);
		SemiInterval otherSemiInterval = new OpenLowerSemiInterval(5.5);
		assertEquals(semiInterval, otherSemiInterval);
		
		semiInterval = new OpenUpperSemiInterval(5.5);
		otherSemiInterval = new OpenUpperSemiInterval(5.5);
		assertEquals(semiInterval, otherSemiInterval);
	}
	
	@Test
	public void testHashCode() {
		semiInterval = new OpenLowerSemiInterval(5.5);
		SemiInterval otherSemiInterval = new OpenLowerSemiInterval(5.5);
		assertEquals(semiInterval.hashCode(), otherSemiInterval.hashCode());
		
		semiInterval = new OpenUpperSemiInterval(5.5);
		otherSemiInterval = new OpenUpperSemiInterval(5.5);
		assertEquals(semiInterval.hashCode(), otherSemiInterval.hashCode());
	}
	
	
}
