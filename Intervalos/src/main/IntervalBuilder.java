package main;

public class IntervalBuilder {

	private OpenUpperSemiInterval min;
	private OpenLowerSemiInterval lowerSemiInterval;
	private boolean minConfigured;
	private boolean lowerConfigured;

	public IntervalBuilder(){
		this.minConfigured = false;
		this.lowerConfigured = false;
	}

	public IntervalBuilder open(double value) {
		assert !this.minConfigured || !this.lowerConfigured;
		if (!this.minConfigured){
			this.min = new OpenUpperSemiInterval(value);
			this.minConfigured = true;
		} else if (!this.lowerConfigured){
			this.lowerSemiInterval = new OpenLowerSemiInterval(value);
			this.lowerConfigured = true;
		}
		return this;
	}
  
	public IntervalBuilder closed(double value) {
		assert !this.minConfigured || !this.lowerConfigured;
		if (!this.minConfigured){
			this.min = new CloseUpperSemiInterval(value);
			this.minConfigured = true;
		} else if (!this.lowerConfigured){
			this.lowerSemiInterval = new CloseLowerSemiInterval(value);
			this.lowerConfigured = true;
		}
		return this;
	}

	public Interval build() {
		assert this.minConfigured && this.lowerConfigured;
		return new Interval(this.min, this.lowerSemiInterval);
	} 

}
