package test;

import org.junit.jupiter.api.Test;

import main.ClosedMin;
import main.Min;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClosedMinTest extends MinTest {

  @Override
  protected Min createMin() {
    return new ClosedMin(this.point.getEquals());
  }

  @Test
  @Override
  public void givenMinWhenIsWithinWithEqualsValue(){
    assertTrue(this.min.isWithin(this.point.getEquals()));
  }
  
}
