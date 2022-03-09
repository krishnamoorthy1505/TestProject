package com.java8.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class Periods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Period.ofDays(10));
		System.out.println(Period.ofYears(2017));
		Period p=Period.ofDays(10);
		Temporal temp=p.addTo(LocalDate.now());
		System.out.println(temp);
		//Duration d=Duration.

	}

}
