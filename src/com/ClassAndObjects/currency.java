package com.ClassAndObjects;

import java.text.NumberFormat;

public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double currency1 = new Double(12354.23);
		NumberFormat currency1Formatter;
		String currency1Out;
		currency1Formatter = NumberFormat.getCurrencyInstance(currentLocale);
		currency1Out = currency1Formatter.format(currency1);
		System.out.println(currency1Out +" " + currentLocale.toString());

	}

}
