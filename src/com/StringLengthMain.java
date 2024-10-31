package com;

public class StringLengthMain
{
	public static void main(String[] args) {
		StringLength str= s -> {
			return s.length();
		};

		System.out.println("Length of the String is "+str.length("anusha"));
	}
}
