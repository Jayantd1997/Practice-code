
public class ICICI implements Bank{

	@Override
	public double getRateOfIntrest() {
		System.out.println("Rate Of Intrest ICICI: " + (baseIntrest * 20));
		return baseIntrest * 20;
	}

}
