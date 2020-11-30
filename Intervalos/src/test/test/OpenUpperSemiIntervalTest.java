package test.test;

import org.junit.jupiter.api.Test;

import main.OpenUpperSemiInterval;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenUpperSemiIntervalTest extends SemiIntervalTest {
  
  protected OpenUpperSemiInterval createSemiInterval() {
    return new OpenUpperSemiInterval(this.point.getEquals());
  }

  @Test
  public void givenValueOutsideSemiIntervalThenFalse(){
    assertFalse(this.semiInterval.include(this.point.getLess()));
  }

  @Test
  public void givenValueEqualsSemiIntervalLimit(){
    assertFalse(this.semiInterval.include(this.point.getEquals()));
  }

  @Test
  public void givenValueIntsideSemiIntervalThenTrue(){
    assertTrue(this.semiInterval.include(this.point.getGreater()));
  }
 
}

