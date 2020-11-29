package test.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.OpenLowerSemiInterval;
import test.Point;

public class MaxTest {
  
  protected OpenLowerSemiInterval max;
  protected Point point;

  @BeforeEach
  public void before(){
    this.point = new Point(4.4);
    this.max = this.createMax();
  }

  protected OpenLowerSemiInterval createMax() {
    return new OpenLowerSemiInterval(this.point.getEquals());
  }

  @Test
  public void givenMaxWhenIsWithinWithLessValueThenTrue(){
    assertTrue(this.max.isWithin(this.point.getLess()));
  }

  @Test
  public void givenMaxWhenIsWithinWithEqualsValue(){
    assertFalse(this.max.isWithin(this.point.getEquals()));
  }

  @Test
  public void givenMaxWhenIsWithinWithGreaterValueThenTrue(){
    assertFalse(this.max.isWithin(this.point.getGreater()));
  }
 
}
