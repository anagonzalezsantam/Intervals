package test.test;

import org.junit.jupiter.api.Test;

import main.CloseUpperSemiInterval;
import main.OpenUpperSemiInterval;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CloseUpperSemiIntervalTest extends OpenUpperSemiIntervalTest {

  @Override
  protected OpenUpperSemiInterval createUpperSemiInterval() {
    return new CloseUpperSemiInterval(this.point.getEquals());
  }

  @Test
  @Override
  public void givenValueEqualsSemiIntervalLimit(){
    assertTrue(this.upperSemiInterval.include(this.point.getEquals()));
  }
  
}
