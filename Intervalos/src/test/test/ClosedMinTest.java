package test.test;

import org.junit.jupiter.api.Test;

import main.ClosedMin;
import main.OpenUpperSemiInterval;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClosedMinTest extends OpenUpperSemiIntervalTest {

  @Override
  protected OpenUpperSemiInterval createMin() {
    return new ClosedMin(this.point.getEquals());
  }

  @Test
  @Override
  public void givenMinWhenIsWithinWithEqualsValue(){
    assertTrue(this.min.include(this.point.getEquals()));
  }
  
}
