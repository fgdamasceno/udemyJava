package util;

public class CurrencyConverter {
	
	public static double dollarPrice;
	public static double dollarQuantity;
	
	public static double dollarToReal() {
		return dollarPrice * dollarQuantity * (1 + 0.06);
	}

}
