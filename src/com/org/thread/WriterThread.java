package com.org.thread;

public class WriterThread implements Runnable {

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this){
			System.out.println("I am called by reader........");
			try {
			for(int i=0;i<=3;i++){
				
					Thread.sleep(1000);
				} 
			}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("I completed writing........so notified reader....");
			
			notify();
			}
			
		}
	

}
