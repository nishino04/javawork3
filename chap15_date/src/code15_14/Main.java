package code15_14;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		Instant i1=Instant.now();
		System.out.println(i1);
		
		Instant i2 =Instant.ofEpochMilli(1600705425827L);
		System.out.println(i2);
		long l=i2.toEpochMilli();
		System.out.println(l);
		
		ZonedDateTime z1=ZonedDateTime.now();
		ZonedDateTime z2=ZonedDateTime.of(2023, 1,2,3,4,5,6, ZoneId.of("Asia/Tokyo"));
		System.out.println(z1);
		System.out.println(z2);
		
		Instant i3=z2.toInstant();
		ZonedDateTime z3=i3.atZone(ZoneId.of("Europe/London"));
		System.out.println(i3);
		System.out.println(z3);
		
		System.out.println("東京:"+z2.getYear()+"年"+z2.getMonth()+"月"+z2.getDayOfMonth()+"日");
		System.out.println("ロンドン:"+z3.getYear()+"/"+z3.getMonth()+"/"+z3.getDayOfMonth());
		if(z2.isEqual(z3)) {
			System.out.println("同時刻");
		}
	}

}
