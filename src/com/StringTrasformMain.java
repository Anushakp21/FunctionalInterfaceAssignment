package com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTrasformMain {
	public static void main(String[] args) {
		Transformer trans1=(s) -> s.toUpperCase();
		Transformer trans2=(s) -> s.toLowerCase();
		Transformer trans3=(s) -> { 
			if (s == null || s.isEmpty()) 
			{
				return s;
			}
			String[] words = s.split("\\s+");
			StringBuilder titleCase = new StringBuilder();

			 return Arrays.stream(s.split("\\s+")) // Split by whitespace and create a stream
	                 .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
	                 .collect(Collectors.joining(" "));
		};

		System.out.println("string converted to UpperCase :"+trans1.transform("anusha"));
		System.out.println("string converted to Lowercase :"+trans2.transform("anusha"));
		System.out.println("string converted to Titlecase :"+trans3.transform("anusha reddy"));
	}
}
