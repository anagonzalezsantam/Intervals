package test.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.ClosedMax;
import main.OpenLowerSemiInterval;

public class ClosedMaxTest extends MaxTest {

  @Override
  protected OpenLowerSemiInterval createMax() {
    return new ClosedMax(this.point.getEquals());
  }

  @Test
  @Override
  public void givenMaxWhenIsWithinWithEqualsValue(){
    assertTrue(this.max.isWithin(this.point.getEquals()));
  }
  
}
