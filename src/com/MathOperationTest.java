package com;

public class MathOperationTest {
	  public static void main(String[] args) {
	       
	        MathOperation modulus = (a, b) -> a % b;

	        MathOperation power = (a, b) -> Math.pow(a, b);

	        double num1 = 10;
	        double num2 = 3;

	        System.out.println("Modulus is "  + modulus.calculate(num1, num2)); 
	        System.out.println("Power is "  + power.calculate(num1, num2));   
	    }
}
