package test.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.OpenLowerSemiInterval;
import test.Point;

public class OpenLowerSemiIntervalTest {
  
  protected OpenLowerSemiInterval lowerSemiInterval;
  protected Point point;

  @BeforeEach
  public void before(){
    this.point = new Point(4.4);
    this.lowerSemiInterval = this.createLowerSemiInterval();
  }

  protected OpenLowerSemiInterval createLowerSemiInterval() {
    return new OpenLowerSemiInterval(this.point.getEquals());
  }

  @Test
  public void givenMaxWhenIsWithinWithLessValueThenTrue(){
    assertTrue(this.lowerSemiInterval.include(this.point.getLess()));
  }

  @Test
  public void givenMaxWhenIsWithinWithEqualsValue(){
    assertFalse(this.lowerSemiInterval.include(this.point.getEquals()));
  }

  @Test
  public void givenMaxWhenIsWithinWithGreaterValueThenTrue(){
    assertFalse(this.lowerSemiInterval.include(this.point.getGreater()));
  }
 
}
