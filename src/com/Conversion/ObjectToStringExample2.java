package com.Conversion;

public class ObjectToStringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev  = sb.toString();
		if(s.equals(rev)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not Palindrome String");
		}

	}

}
