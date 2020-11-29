package main;

public class OpenUpperSemiInterval {

	protected double value;

	public OpenUpperSemiInterval(double value) {
		this.value = value;
	}
	
	public boolean include(double value) {
		return this.value < value;
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
		OpenUpperSemiInterval other = (OpenUpperSemiInterval) obj;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}
  
  @Override
	public String toString() {
		return "(" + this.value;
	}	
  
}
