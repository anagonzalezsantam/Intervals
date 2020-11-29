package main;

public class OpenLowerSemiInterval extends SemiInterval {

	protected double limit;

	public OpenLowerSemiInterval(double limit) {
		super(limit);
	}

	public boolean include(double value) {
		return this.limit > value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(limit);
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
	    if (Double.doubleToLongBits(limit) != Double.doubleToLongBits(other.limit))
	      return false;
	    return true;
	}

	@Override
	public String toString() {
		return this.limit + ")";
	}

}
