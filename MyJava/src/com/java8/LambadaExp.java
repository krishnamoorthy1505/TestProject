package com.java8;

interface Drawable1{
	void draw();

}
interface Saying{
	public String say(String name);
}


public class LambadaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable1 d =() ->{
			System.out.println("Lambada Expression");
			
		};
		Saying s=(name)->{
			return "Hi"+name;
		};
		System.out.println(s.say("krishna"));
		d.draw();

	}

}
