package com.basic;

public class EnumExample1 {
	enum Season{
			SUMMER(2),WINTER(3),FALL(5),Spring(6);
			int value;

			
			  private Season(int value) {
				  this.value = value;
			  }
			 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(Season s:Season.values())
				System.out.println(s + " "+s.value);
		}
	}

}
