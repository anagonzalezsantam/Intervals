package test.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.OpenUpperSemiInterval;
import test.Point;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenUpperSemiIntervalTest extends SemiIntervalTest {
  
  protected OpenUpperSemiInterval upperSemiInterval;
  protected Point point;

  @BeforeEach
  public void before(){
    this.point = new Point(4.4);
    this.upperSemiInterval = this.createSemiInterval();
  }

  protected OpenUpperSemiInterval createSemiInterval() {
    return new OpenUpperSemiInterval(this.point.getEquals());
  }

  @Test
  public void givenValueOutsideSemiIntervalThenFalse(){
    assertFalse(this.upperSemiInterval.include(this.point.getLess()));
  }

  @Test
  public void givenValueEqualsSemiIntervalLimit(){
    assertFalse(this.upperSemiInterval.include(this.point.getEquals()));
  }

  @Test
  public void givenValueIntsideSemiIntervalThenTrue(){
    assertTrue(this.upperSemiInterval.include(this.point.getGreater()));
  }
 
}

