package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currDate=LocalDate.now();
		System.out.println(currDate.equals(currDate));
		System.out.println(currDate.getDayOfMonth());
		System.out.println(currDate);
		
		System.out.println(currDate.getDayOfYear());
		System.out.println(currDate.getMonthValue());
		System.out.println(currDate.getYear());
		
		

		

	}

}
