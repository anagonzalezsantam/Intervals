package test.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.CloseLowerSemiInterval;
import main.OpenLowerSemiInterval;

public class ClosedMaxTest extends OpenLowerSemiIntervalTest {

  @Override
  protected OpenLowerSemiInterval createMax() {
    return new CloseLowerSemiInterval(this.point.getEquals());
  }

  @Test
  @Override
  public void givenMaxWhenIsWithinWithEqualsValue(){
    assertTrue(this.max.include(this.point.getEquals()));
  }
  
}
