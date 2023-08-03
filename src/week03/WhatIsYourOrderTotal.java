package week03;

public class WhatIsYourOrderTotal {
	
	static double orderTotal(double product1, double product2, double product3, double taxRate) {
		
		double subTotal = product1 + product2 + product3;
		double tax = subTotal * taxRate;
		double total = subTotal + tax;
		return total;
	}

	public static void main(String[] args) {
	
		double product1, product2, product3, taxRate;
		product1 = 19.99;
		product2 = 22.00;
		product3 = 4.55;
		taxRate = .07;
		System.out.println("Your order total is: $" + String.format("%,.2f", orderTotal(product1, product2, product3, taxRate)));
	}
}
