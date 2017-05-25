package com.org.thread;

public class PrintOddEvenWaitAndNotyfi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sharedprinter sp=new Sharedprinter();
		Thread th=new Thread(new PrintEven(sp, 10));
		Thread th1=new Thread(new PrintOdd(sp, 10));
th.start();
th1.start();
	}

}


class Sharedprinter{
	
	boolean flag=false;
	public void printEvenNum(int num){
	synchronized(this){
		while(!flag){
			try{
				wait();
			}
			catch(InterruptedException e){
				
			}
		}
		System.out.println(num);
		flag=false;
		notify();
	}
	}
	
	
	public void printOddNum(int num){
		synchronized(this){
			while(flag){
				try{
					wait();
				}
				catch(InterruptedException e){
					
				}
			}
			System.out.println(num);
			flag=true;
			notify();
		}
		}
}



class PrintEven implements Runnable{
	
	Sharedprinter sp;
	int index;

	public PrintEven(Sharedprinter sp, int index) {
		super();
		this.sp = sp;
		this.index = index;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=2;i<=index;i+=2){
			  sp.printEvenNum(i);
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class PrintOdd implements Runnable{

	Sharedprinter sp;
	int index;

	public PrintOdd(Sharedprinter sp, int index) {
		super();
		this.sp = sp;
		this.index = index;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= index; i+=2){
            sp.printOddNum(i);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
	
}