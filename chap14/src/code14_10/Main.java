package code14_10;

public class Main {
	public static void main(String[] args) {
		Hero h =new Hero();
		Hero j=new Hero();
		Hero.money+=200;
		h.money=300;
		System.out.println(h.money);
		System.out.println(j.money);
		j.money=600;
		System.out.println(h.money);
		System.out.println(j.money);
		Hero.setRM();	
		System.out.println(h.money);
		System.out.println(j.money);
		j.setRM();
		System.out.println(h.money);
		System.out.println(j.money);
	}
}
