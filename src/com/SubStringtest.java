package com;

public class SubStringtest {
	public static void main(String[] args) {

		Predicate<String> result= (s,substring) -> s.contains(substring);

		String s="java programming";
		String substring="java";
		
		System.out.println(result.Test(s, substring));
	}
}
