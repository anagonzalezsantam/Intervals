package main;

public class OpenUpperSemiInterval extends SemiInterval {

	public OpenUpperSemiInterval(double limit) {
		super(limit);
	}
	
	public boolean include(double value) {
		return this.limit < value;
	}
  
  @Override
	public String toString() {
		return "(" + this.limit;
	}	
  
}
