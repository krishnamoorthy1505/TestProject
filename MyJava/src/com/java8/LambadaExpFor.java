package com.java8;

import java.util.ArrayList;
import java.util.List;

public class LambadaExpFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> addName=new ArrayList<String>();
		addName.add("A");
		addName.add("B");
		addName.forEach((n)->System.out.println(n));
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread 1 isRunning");
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		Runnable r2=()->{
			System.out.println("T2 is Running");
		};
		Thread t2=new Thread(r2);
		t2.start();
 
	}

}
