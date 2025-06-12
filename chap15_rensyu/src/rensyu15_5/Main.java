package rensyu15_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		System.out.println(l);// 2025-06-10
		Calendar c;
		Period p =Period.ofYears(100);
		LocalDate mirai=l.plus(p);
		System.out.println(mirai);// 2125-06-10
		DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(f.format(mirai));//  2125/6/10
		LocalDate l2 =l.plusDays(100);
		System.out.println(l2);

	}

}
