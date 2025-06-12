package code15_12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c);//カレンダークラスの持つ現在時刻の情報が全て格納されている。
		Date now =c.getTime();
		int m=c.get(Calendar.MONTH)+1;
		int y=c.get(Calendar.YEAR);
		int md=c.get(Calendar.DAY_OF_MONTH);//MONTHは0始まりなので＋1しないといけない
		System.out.println(y+"年"+m+"月"+md+"日");
		
		c.set(2023,8,18,5,53,20);
		c.set(Calendar.MONTH,9);
		Date d =c.getTime();
		System.out.println(d);
		System.out.println(now);
	}

}
