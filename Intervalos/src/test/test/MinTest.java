package test.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.OpenUpperSemiInterval;
import test.Point;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MinTest {
  
  protected OpenUpperSemiInterval min;
  protected Point point;

  @BeforeEach
  public void before(){
    this.point = new Point(4.4);
    this.min = this.createMin();
  }

  protected OpenUpperSemiInterval createMin() {
    return new OpenUpperSemiInterval(this.point.getEquals());
  }

  @Test
  public void givenMinWhenIsWithinWithLessValueThenTrue(){
    assertFalse(this.min.isWithin(this.point.getLess()));
  }

  @Test
  public void givenMinWhenIsWithinWithEqualsValue(){
    assertFalse(this.min.isWithin(this.point.getEquals()));
  }

  @Test
  public void givenMinWhenIsWithinWithGreaterValueThenTrue(){
    assertTrue(this.min.isWithin(this.point.getGreater()));
  }
 
}

