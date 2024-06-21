package Utility;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Local;

public class Dateutility {
	public static String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays ) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
		
	}


	
	public static String getRequiredDateBasedOnNumberOfMonths(String format,int numberOfMonths) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MONTH, numberOfMonths);
	SimpleDateFormat s=new SimpleDateFormat(format);
	return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static String getRequiredDateBasedOnNumberOfYears(String format, int numberOfYears ) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.YEAR, numberOfYears);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	
	
	public static String getRequiredDateTimeBasedOnNumberOfDays(String format,int numberOfDays) {
		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
		
	
	}
	public static int getlocaltime() {
	
			LocalTime OBJ=LocalTime.now();
			System.out.println(OBJ);
			return 0;
	 
		
		
		
	}
	//public static 
	
	@Test
	public void  testcase()
	{
		System.out.println(getlocaltime());
	}
	@Test
	public void testCase() {
		System.out.println(getRequiredDateTimeBasedOnNumberOfDays("dd-M-yyyy hh:mm:ss", 0));
}
	@Test
	public void testCase1() {
		System.out.println(getRequiredDateTimeBasedOnNumberOfDays("dd-M-yyyy hh:mm:ss", 8));
		System.out.println(getRequiredDateBasedOnNumberOfMonths("yyyy-MM-dd hh:mm:ss", 8));
		LocalTime obj=LocalTime.now();
		System.out.println(obj);
		DateTimeFormatter myformatedate= DateTimeFormatter.ofPattern("hh:mm:ss");
		String formaterdate=obj.format(myformatedate);
		System.out.println("afterformating date:"+formaterdate);
	}
}




