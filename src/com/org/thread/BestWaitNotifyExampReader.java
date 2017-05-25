package com.org.thread;

public class BestWaitNotifyExampReader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("I am reader Thread...........");
		while(true){
			WriterThread thread=new WriterThread();
			
			Thread t=new Thread(thread);
			t.start();
			
			synchronized(thread){
				
				System.out.println("i am waiting for completing the task by writer");
				thread.wait();
				System.out.println("i got notification from writer");
				
			}
		}
	}

}
