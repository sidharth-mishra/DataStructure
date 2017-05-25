package com.org.thread;

public class MyRunnableExamp implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnableExamp mr=new MyRunnableExamp();
		Thread t=new Thread(mr);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
