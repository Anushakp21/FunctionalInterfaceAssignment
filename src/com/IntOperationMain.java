package com;

public class IntOperationMain 
{
	public static void main(String[] args) {
		IntOperation add= (x,y) -> x+y;

		IntOperation sub= (x,y) -> x-y;

		IntOperation mul= (x,y) -> x*y;

		IntOperation div= (x,y) -> {
			if (y == 0) 
			{
				throw new ArithmeticException("Cannot divide by zero");
			}
			return x / y;
		};

		System.out.println("Addition of two numbers "+add.apply(10,3));
		System.out.println("Addition of two numbers "+sub.apply(10,3));
		System.out.println("Addition of two numbers "+mul.apply(8,3));
		System.out.println("Addition of two numbers "+div.apply(10,5));     
	}

}
