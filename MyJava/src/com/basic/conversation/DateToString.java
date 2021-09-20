package com.basic.conversation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currDate=Calendar.getInstance().getTime();
		DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate=dateFormat.format(currDate);
		System.out.println("Date to String "+strDate);

	}

}
