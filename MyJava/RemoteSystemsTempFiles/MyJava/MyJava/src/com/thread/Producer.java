package com.thread;

public class Producer extends Thread{
	Queve q;
	public Producer(Queve q) {
		// TODO Auto-generated constructor stub
		this.q=q;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			q.put(i);
			System.out.println("Producer="+i);
		}
	}

}
