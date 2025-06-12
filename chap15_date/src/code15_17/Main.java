package code15_17;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate d1=LocalDate.of(2000, 12, 16);
		LocalDate d2=LocalDate.of(2000, 12, 19);
		
		//3日間を表すperiodを2通り記述
		Period p1=Period.ofDays(3);
		Period p2=Period.between(d1, d2);
		System.out.println(p1);
		System.out.println(p2);
		LocalDate d3=d2.plus(p2);
		System.out.println(d3);
	}

}
