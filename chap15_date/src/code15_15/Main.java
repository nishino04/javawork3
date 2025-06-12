package code15_15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {
		LocalDateTime l1=LocalDateTime.now();
		LocalDateTime l2=LocalDateTime.of(2024,12,12,9,5,0,0);
		//LocalDateTimeクラスのofメソッドは引数に(year,month,,,,,)
		System.out.println(l1);
		System.out.println(l2);
		ZonedDateTime z1=l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3=z1.toLocalDateTime();
		System.out.println(z1);
		System.out.println(l3);
	}
}
