package test.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.OpenLowerSemiInterval;
import test.Point;

public class OpenLowerSemiIntervalTest extends SemiIntervalTest {
  
  protected OpenLowerSemiInterval lowerSemiInterval;
  protected Point point;

  @BeforeEach
  public void before(){
    this.point = new Point(4.4);
    this.lowerSemiInterval = this.createSemiInterval();
  }

  protected OpenLowerSemiInterval createSemiInterval() {
    return new OpenLowerSemiInterval(this.point.getEquals());
  }

  @Test
  public void givenValueIntsideSemiIntervalThenTrue(){
    assertTrue(this.lowerSemiInterval.include(this.point.getLess()));
  }

  @Test
  public void givenValueEqualsSemiIntervalLimit(){
    assertFalse(this.lowerSemiInterval.include(this.point.getEquals()));
  }

  @Test
  public void givenValueOutsideSemiIntervalThenFalse(){
    assertFalse(this.lowerSemiInterval.include(this.point.getGreater()));
  }
 
}
