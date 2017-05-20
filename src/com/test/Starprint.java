package com.test;

public class Starprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printStar(7);
		
		
	}
	public static void printStar(int number){
		
		for(int i=0;i<=number;i++){
			System.out.println(" ");

			for(int j=i;j<=number;j++){
				System.out.print(" ");
			}
			
			for(int k=1;k<=i+1;k++){
				System.out.print(" *");
			}

		}
		
		
		
	}

}
