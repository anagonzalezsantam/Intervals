package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.SemiInterval;

public class SemiIntervalTest {

	public SemiInterval semiInterval;
	
	@Test
	public void testCreateSemiInterval() {
		semiInterval = new SemiInterval(5.5);
		assertEquals("5.5", semiInterval.toString());
	}
	
}
