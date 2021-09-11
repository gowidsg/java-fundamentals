/*
 * The java.time, java.util, java.sql and java.text packages contains classes for representing date and time. 
 * Following classes are important for dealing with date in java.

Java 8 Date/Time API
Java has introduced a new Date and Time API since Java 8. 
The java.time package contains Java 8 Date and Time classes.
 */

package javaeightfeatures;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;



public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Using DateTimeFormatter and localdatetime: " + dtf.format(now));

		SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = new Date();
		System.out.println("Using Simple date format and util date: " + form.format(d));

		System.out
				.println("Using java.time.LocalTiem:  " + java.time.LocalDate.now() + " " + java.time.LocalTime.now());

		System.out.println(java.time.LocalDateTime.now());

		System.out.println(java.time.Clock.systemUTC().instant());

		System.out.println("Using java.util.Date:  " + d);

		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		System.out.println("using java.sql.Date: " + date);

		System.out.println("Using java.uti.Calendar.getInstance(): " + java.util.Calendar.getInstance().getTime());

	}

}
