package code15_11;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past =new Date(16949840000000L);
		System.out.println(past);
	}
}
