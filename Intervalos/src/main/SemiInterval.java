package main;

public abstract class SemiInterval {

	protected double limit;

	public SemiInterval(double limit) {
		this.limit = limit;
	}
	
	public abstract boolean include(double value);
	
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
	    SemiInterval other = (SemiInterval) obj;
	    if (Double.doubleToLongBits(limit) != Double.doubleToLongBits(other.limit))
	      return false;
	    return true;
	}

	@Override
	public String toString() {
		return this.limit + "";
	}
}
