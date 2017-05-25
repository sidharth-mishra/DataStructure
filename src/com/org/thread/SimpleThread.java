package com.org.thread;

public class SimpleThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleThread th=new SimpleThread();
		th.start();
		System.out.println("in mainThread name:  "+Thread.currentThread().getName());
		
	}
	
	
	public void run(){
		System.out.println("in thread 1:  "+Thread.currentThread().getName());
	}

}
