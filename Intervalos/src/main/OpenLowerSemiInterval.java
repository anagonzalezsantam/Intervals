package main;

public class OpenLowerSemiInterval extends SemiInterval {

	public OpenLowerSemiInterval(double limit) {
		super(limit);
	}

	public boolean include(double value) {
		return this.limit > value;
	}

	@Override
	public String toString() {
		return super.toString() + ")";
	}

}
