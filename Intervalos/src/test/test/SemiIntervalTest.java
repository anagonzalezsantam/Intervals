package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.OpenLowerSemiInterval;
import main.OpenUpperSemiInterval;
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
		
}
