package com.basic.conversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimestamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currDate=new Date();
		Timestamp ts=new Timestamp(currDate.getTime());
		System.out.println(ts);
		SimpleDateFormat simpleDateFor=new SimpleDateFormat("YYYY-mm-dd HH:mm:ss");
		String s=simpleDateFor.format(ts);
		System.out.println(s);
		
		//conversion TimeStamp to Date
		Timestamp tss=new Timestamp(System.currentTimeMillis());
		Date dd=new Date(tss.getTime());
		System.out.println(dd);
		

	}

}
