package com.thread;

public class TestQueve {
	public static void main(String[] args) {
		Queve q=new Queve();
		Consumer c=new Consumer(q);

		Producer p=new Producer(q);
		p.start();
		c.start();
	}

}
