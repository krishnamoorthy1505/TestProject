package com.thread;

public class Consumer extends Thread {
	Queve q;
	public Consumer(Queve q) {
		// TODO Auto-generated constructor stub
		this.q=q;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			int v=q.get();
			System.out.println("Consumer="+v);
		}
		
	}
	

}
