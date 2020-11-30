package test.test;

import org.junit.jupiter.api.Test;

import main.CloseUpperSemiInterval;
import main.OpenUpperSemiInterval;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CloseUpperSemiIntervalTest extends OpenUpperSemiIntervalTest {

  @Override
  protected OpenUpperSemiInterval createSemiInterval() {
    return new CloseUpperSemiInterval(this.point.getEquals());
  }

  @Test
  @Override
  public void givenValueEqualsSemiIntervalLimit(){
    assertTrue(this.semiInterval.include(this.point.getEquals()));
  }
  
}
