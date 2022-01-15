package com.Conversion;

public class ObjectToStringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();
		System.out.println("String is: "+s);
		System.out.println("Reverse String is: "+rev);

	}

}
