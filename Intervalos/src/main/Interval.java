package main;

public class Interval {

	private OpenUpperSemiInterval min;
	private OpenLowerSemiInterval lowerSemiInterval;

	public Interval(OpenUpperSemiInterval min, OpenLowerSemiInterval lowerSemiInterval) {
		assert min.value <= lowerSemiInterval.limit;
		this.min = min;
		this.lowerSemiInterval = lowerSemiInterval;
	}

	public boolean include(double value) {
			return this.min.include(value) && this.lowerSemiInterval.include(value);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lowerSemiInterval == null) ? 0 : lowerSemiInterval.hashCode());
		result = prime * result + ((min == null) ? 0 : min.hashCode());
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
		if (min == null) {
			if (other.min != null)
				return false;
		} else if (!min.equals(other.min))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.min.toString() + ", " + lowerSemiInterval.toString();
	}	

}