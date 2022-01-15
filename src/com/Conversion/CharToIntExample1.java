package com.Conversion;

public class CharToIntExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		char c2 = '1';
		
		int a = c;
		int b = c2;
		int d=Character.getNumericValue(c2);  
		int e=Integer.parseInt(String.valueOf(c2));  

		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		

	}

}
