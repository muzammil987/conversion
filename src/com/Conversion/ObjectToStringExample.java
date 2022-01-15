package com.Conversion;


class Emp{}
public class ObjectToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e = new Emp();
		String s = e.toString();
		String s2 = String.valueOf(e);
		System.out.println(s);
		System.out.println(s2);

	}

}
