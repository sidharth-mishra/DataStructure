package com.test;

public class PrimeNumber {

//hello santosh welcome to git

	
public static void main(String[] args) {
	
	System.out.println(isPrime(8));
	
}

	public static boolean isPrime(int number){
		boolean flag=true;
		for(int i=2;i<number/2;i+=2){
			if(number%i==0 || number%(i+1)==0){
				flag=false;
				break;
			}
		}
		
		return flag;
	}
	
	
}
