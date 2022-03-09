package com.java8.time;

import java.time.Clock;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffsetTime ot=OffsetTime.now();
		System.out.println(ot);
		System.out.println(ot.getHour());
		
		
		OffsetDateTime odt=OffsetDateTime.now();
		System.out.println(odt);
		System.out.println(odt.getDayOfMonth());
		System.out.println(odt.getDayOfYear());
		System.out.println(odt.getHour());
		System.out.println(odt.getMonthValue());
		System.out.println(odt.get(ChronoField.AMPM_OF_DAY));
		System.out.println(odt.getYear());
		System.out.println(odt.getOffset());
		
		Clock clk=Clock.systemDefaultZone();
		System.out.println(clk);
		System.out.println(clk.toString());
		System.out.println(clk.getClass());
		System.out.println(clk.getZone());
		System.out.println(clk.systemUTC().instant());
	}

}
