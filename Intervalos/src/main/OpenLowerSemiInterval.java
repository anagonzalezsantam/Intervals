package main;

public class OpenLowerSemiInterval {

	protected double value;

	public OpenLowerSemiInterval(double value) {
		this.value = value;
	}

	public boolean isWithin(double value) {
		return this.value > value;
	}

	public boolean include(double value) {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
	    OpenLowerSemiInterval other = (OpenLowerSemiInterval) obj;
	    if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
	      return false;
	    return true;
	}

	@Override
	public String toString() {
		return this.value + ")";
	}

}
