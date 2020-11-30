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
	
	public abstract SemiInterval createSemiInterval();
		
	@Test
	public abstract void givenValueOutsideSemiIntervalThenFalse();

	@Test
	public abstract void givenValueEqualsSemiIntervalLimit();

	@Test
	public abstract void givenValueIntsideSemiIntervalThenTrue();
}
