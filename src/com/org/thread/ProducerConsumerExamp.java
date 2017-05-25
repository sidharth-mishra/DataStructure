package com.org.thread;

public class ProducerConsumerExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
	}

}


	
class Message{
private String msg;


public Message(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

}
///////////////////////////////////////////////
class Waiter implements Runnable{
	
private Message msg;
public Waiter(Message m){
	this.msg=m;
}
public void run(){
	synchronized(msg){
		
		try {
			msg.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" processed: "+msg.getMsg());
	}
}

}

class Notifier implements Runnable{
	
private Message msg;
public Notifier(Message m){
	this.msg=m;
}
public void run(){
	 try {
	Thread.sleep(1000);
	
	synchronized(msg){
      msg.setMsg(" Notifier work done");
		msg.notify();
	}
	 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}


