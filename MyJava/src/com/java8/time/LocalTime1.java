package com.java8.time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		LocalTime lt1=LocalTime.of(10, 45, 10);
		System.out.println(lt1);
		ZoneId zid=ZoneId.of("Asia/Kolkata");
		System.out.println(LocalTime.now(zid));
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss a")));;
		
		System.out.println(ldt.get(ChronoField.YEAR));
		System.out.println(ldt.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
		System.out.println(ldt.get(ChronoField.ERA));
		System.out.println(ldt.get(ChronoField.AMPM_OF_DAY));
		MonthDay md=MonthDay.now();
		System.out.println(md);
		int my=md.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(my);


	} 

}
