package com.test;

public class PrimeNumber {
	//----------------Prime Check------------------ HEAD
//hello santosh

//		hi  'master' of https://github.com/sidhart


//		hi sid branch 'master' of https://github.com/sidharth-mishra/DataStructure.git
	///prime check222222
//		hi  'master' of https://github.com/sidharth-mishra/DataStructure.git

	
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
