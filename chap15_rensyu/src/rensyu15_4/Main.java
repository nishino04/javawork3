package rensyu15_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		System.out.println(c);
		int h=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(h);
		h+=100;
		c.set(Calendar.DAY_OF_MONTH,h);
		h=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(h);
		Date dd=c.getTime();
		System.out.println(dd);
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy年MM月dd日");
		String s =fmt.format(dd);
		System.out.println(s);
	}
}
