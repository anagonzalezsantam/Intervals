package test.test;

import org.junit.jupiter.api.Test;

import main.CloseUpperSemiInterval;
import main.OpenUpperSemiInterval;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CloseUpperSemiIntervalTest extends OpenUpperSemiIntervalTest {

  @Override
  protected OpenUpperSemiInterval createMin() {
    return new CloseUpperSemiInterval(this.point.getEquals());
  }

  @Test
  @Override
  public void givenMinWhenIsWithinWithEqualsValue(){
    assertTrue(this.min.include(this.point.getEquals()));
  }
  
}
