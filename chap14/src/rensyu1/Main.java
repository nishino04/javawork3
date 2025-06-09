package rensyu1;

public class Main {

	public static void main(String[] args) {
		Ginkou a=new Ginkou();
		a.accountNumber="4649";
		a.balance=1592;
		Ginkou a2=new Ginkou();
		a2.accountNumber="  4649";
		a2.balance=1600;
		System.out.println(a);
		System.out.println("口座番号入れろ");
		String s=new java.util.Scanner(System.in).nextLine();
		if(a.equals(a2)==true) {
			System.out.println("あってる");
		}else {
			System.out.println("違うぞ");
		}
	}

}
