package code15_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception{
		SimpleDateFormat f=
				new SimpleDateFormat("MM月dd日aK時E曜日");
//		Date d =f.parse("2023-09-18");
//		System.out.println(d);
		
		Date now=new Date();
		String s=f.format(now);
		System.out.println(s);
	}
}
