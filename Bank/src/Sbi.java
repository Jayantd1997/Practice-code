
public class Sbi implements Bank {

	@Override
	public double getRateOfIntrest() {
		System.out.println("Rate of Intrest of SBI: " + (baseIntrest * 10));
		return baseIntrest * 10;
	}

}
