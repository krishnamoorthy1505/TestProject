package com.java8;
interface Drawable{
	void draw();
}

public class LambadaWOut {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable dw=new Drawable() {
			public void draw() {
				System.out.println("Without Lambada");
				
			}
		};
		dw.draw();
	}

}
