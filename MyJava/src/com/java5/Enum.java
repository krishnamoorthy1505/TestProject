package com.java5;

public class Enum {
	public enum Season {WINTER,SPRING,SUMMER,FALL}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Season s : Season.values()) {
			System.out.println(s);
		}
	}

}
