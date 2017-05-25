package com.test;

public class FactorialCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorialCheck(5));
	}
public static int factorialCheck(int n){
	
	if(n==0){
		return 1;
	}
	else{
		return factorialCheck(n-1);
	}
	
}
}
