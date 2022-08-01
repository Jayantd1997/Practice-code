
public class AXIS implements Bank {

	@Override
	public double getRateOfIntrest() {
System.out.println("Rate Of Intrest AXIS: " + (baseIntrest * 20));
		return baseIntrest * 30;
	}

}
