package binarybyte.services.citestingapplication.fixture;

public class DivisionFixture {

	private double numerator;
	private double denominator;
	
	public void setNumerator(double numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(double denominator) {
		this.denominator = denominator;
	}
	
	public double quotient() {
		return numerator/denominator;
	}
}
