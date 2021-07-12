package com.thread;

public class Queve {
	private int value;
	private boolean empty;
	public Queve() {
		// TODO Auto-generated constructor stub
		empty=true;
	}
	public synchronized void put(int a){
		System.out.println("empty="+empty);
		if(!empty){
			try{
				wait();
			}
			catch(Exception e){
				
			}
		}
		value=a;
		empty=false;
		notify();
	}
	public synchronized int get(){
		if(empty){
			System.out.println("get="+empty);
			try {
				wait();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		int t=value;
		empty=true;
		notify();
		return t;
	}
	
}
