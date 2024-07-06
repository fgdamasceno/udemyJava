package utilities;

public class CurrencyConverter {
	
	public static double dollar;
	public static double amount;
	public static double IOF = 0.06;
	
	public static double converter() {
		return dollar * amount * (1 + IOF);
	}

}
