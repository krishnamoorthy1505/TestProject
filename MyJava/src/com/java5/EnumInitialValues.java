package com.java5;

public class EnumInitialValues {
	public enum Season {WINTER(0),SPRING(1),SUMMER(2),FALL(3);
	int values=0;
	private Season(int values) {
		this.values = values;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Season s:Season.values()) {
			System.out.println(s + " "+s.values);
		}
			
	}

}
