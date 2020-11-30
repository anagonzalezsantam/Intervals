package main;

public class Interval {

	private OpenUpperSemiInterval upperSemiInterval;
	private OpenLowerSemiInterval lowerSemiInterval;

	public Interval(OpenUpperSemiInterval upperSemiInterval, OpenLowerSemiInterval lowerSemiInterval) {
		assert upperSemiInterval.limit <= lowerSemiInterval.limit;
		this.upperSemiInterval = upperSemiInterval;
		this.lowerSemiInterval = lowerSemiInterval;
	}

	public boolean include(double value) {
			return this.upperSemiInterval.include(value) && this.lowerSemiInterval.include(value);
	}

	public boolean isIntersected(Interval interval) {
		return interval.isIn(this) || this.isIn(interval);
	}
	
	private boolean isIn(Interval interval) {
		return interval.include(this.getUpperLimit()) || interval.include(this.getLowerLimit());
	}
	
	private double getUpperLimit() {
		return this.upperSemiInterval.limit;
	}
	
	private double getLowerLimit() {
		return this.lowerSemiInterval.limit;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lowerSemiInterval == null) ? 0 : lowerSemiInterval.hashCode());
		result = prime * result + ((upperSemiInterval == null) ? 0 : upperSemiInterval.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interval other = (Interval) obj;
		if (lowerSemiInterval == null) {
			if (other.lowerSemiInterval != null)
				return false;
		} else if (!lowerSemiInterval.equals(other.lowerSemiInterval))
			return false;
		if (upperSemiInterval == null) {
			if (other.upperSemiInterval != null)
				return false;
		} else if (!upperSemiInterval.equals(other.upperSemiInterval))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.upperSemiInterval.toString() + ", " + lowerSemiInterval.toString();
	}	

}