package test.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.OpenLowerSemiInterval;

public class OpenLowerSemiIntervalTest extends SemiIntervalTest {

  protected OpenLowerSemiInterval createSemiInterval() {
    return new OpenLowerSemiInterval(this.point.getEquals());
  }

  @Test
  public void givenValueIntsideSemiIntervalThenTrue(){
    assertTrue(this.semiInterval.include(this.point.getLess()));
  }

  @Test
  public void givenValueEqualsSemiIntervalLimit(){
    assertFalse(this.semiInterval.include(this.point.getEquals()));
  }

  @Test
  public void givenValueOutsideSemiIntervalThenFalse(){
    assertFalse(this.semiInterval.include(this.point.getGreater()));
  }
 
}
