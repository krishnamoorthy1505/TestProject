package com.basic.string;

public class IndividualCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Individual character";
		for(int i=0;i<name.length();i++) {
			System.out.print(Character.toUpperCase(name.charAt(i))+" ");
		}
	}

}
