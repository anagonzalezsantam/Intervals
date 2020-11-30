package test.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.SemiInterval;
import test.Point;

public abstract class SemiIntervalTest {

	protected SemiInterval semiInterval;
	protected Point point;
	
	@BeforeEach
	  public void before(){
	    this.point = new Point(4.4);
	    this.semiInterval = this.createSemiInterval();
	  }
	
	protected abstract SemiInterval createSemiInterval();
		
	@Test
	protected abstract void givenValueOutsideSemiIntervalThenFalse();

	@Test
	protected abstract void givenValueEqualsSemiIntervalLimit();

	@Test
	protected abstract void givenValueIntsideSemiIntervalThenTrue();
}
