package com.java5;

import java.util.ArrayList;

abstract class Shape{
	abstract void draw();
}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle");
	}
}


public class GenericWildcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Circle> list1=new ArrayList<Circle>();
		list1.add(new Circle());
		ArrayList<Rectangle> l2=new ArrayList<Rectangle>();
		l2.add(new Rectangle());
		drawShape(list1);
		drawShape(l2);
	

	}

	private static void drawShape(ArrayList<? extends Shape> list1) {
		// TODO Auto-generated method stub
		
		for(Shape s: list1) {
			s.draw();
		}
		
	}

}
