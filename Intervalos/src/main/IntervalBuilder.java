package main;

public class IntervalBuilder {

	private OpenUpperSemiInterval upperSemiInterval;
	private OpenLowerSemiInterval lowerSemiInterval;
	private boolean upperConfigured;
	private boolean lowerConfigured;

	public IntervalBuilder(){
		this.upperConfigured = false;
		this.lowerConfigured = false;
	}

	public IntervalBuilder open(double value) {
		assert !this.upperConfigured || !this.lowerConfigured;
		if (!this.upperConfigured){
			this.upperSemiInterval = new OpenUpperSemiInterval(value);
			this.upperConfigured = true;
		} else if (!this.lowerConfigured){
			this.lowerSemiInterval = new OpenLowerSemiInterval(value);
			this.lowerConfigured = true;
		}
		return this;
	}
  
	public IntervalBuilder closed(double value) {
		assert !this.upperConfigured || !this.lowerConfigured;
		if (!this.upperConfigured){
			this.upperSemiInterval = new CloseUpperSemiInterval(value);
			this.upperConfigured = true;
		} else if (!this.lowerConfigured){
			this.lowerSemiInterval = new CloseLowerSemiInterval(value);
			this.lowerConfigured = true;
		}
		return this;
	}

	public Interval build() {
		assert this.upperConfigured && this.lowerConfigured;
		return new Interval(this.upperSemiInterval, this.lowerSemiInterval);
	} 

}
