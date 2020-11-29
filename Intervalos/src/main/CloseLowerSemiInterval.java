package main;

public class CloseLowerSemiInterval extends OpenLowerSemiInterval {

	public CloseLowerSemiInterval(double value) {
		super(value);
	}

	@Override
	public boolean include(double value) {
		return super.include(value) || this.limit == value;
	}

	@Override
	public String toString() {
		return this.limit + "]";
	}	

}
