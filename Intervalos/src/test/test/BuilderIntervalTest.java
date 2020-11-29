package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.CloseLowerSemiInterval;
import main.CloseUpperSemiInterval;
import main.Interval;
import main.IntervalBuilder;
import main.OpenLowerSemiInterval;
import main.OpenUpperSemiInterval;

public class BuilderIntervalTest {

  private double min;
  private double max;

  @BeforeEach
  public void before(){
    this.min = -2.2;
    this.max = 4.4;
  }

  @Test
  public void givenIntervalBuilderWhenOpenOpen(){
    Interval interval = new IntervalBuilder().open(this.min).open(this.max).build();
    assertEquals(interval, new Interval(new OpenUpperSemiInterval(this.min), new OpenLowerSemiInterval(this.max)));
  }

  @Test
  public void givenIntervalBuilderWhenOpenClosed(){
    Interval interval = new IntervalBuilder().open(this.min).closed(this.max).build();
    assertEquals(interval, new Interval(new OpenUpperSemiInterval(this.min), new CloseLowerSemiInterval(this.max)));
  }

  @Test
  public void givenIntervalBuilderWhenClosedOpen(){
    Interval interval = new IntervalBuilder().closed(this.min).open(this.max).build();
    assertEquals(interval, new Interval(new CloseUpperSemiInterval(this.min), new OpenLowerSemiInterval(this.max)));
  }

  @Test
  public void givenIntervalBuilderWhenClosedClosed(){
    Interval interval = new IntervalBuilder().closed(this.min).closed(this.max).build();
    assertEquals(interval, new Interval(new CloseUpperSemiInterval(this.min), new CloseLowerSemiInterval(this.max)));
  }

}
