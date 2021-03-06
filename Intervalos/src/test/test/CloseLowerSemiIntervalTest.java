package test.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.CloseLowerSemiInterval;
import main.OpenLowerSemiInterval;

public class CloseLowerSemiIntervalTest extends OpenLowerSemiIntervalTest {

  @Override
  protected OpenLowerSemiInterval createSemiInterval() {
    return new CloseLowerSemiInterval(this.point.getEquals());
  }

  @Test
  @Override
  public void givenValueEqualsSemiIntervalLimit(){
    assertTrue(this.semiInterval.include(this.point.getEquals()));
  }
  
}
