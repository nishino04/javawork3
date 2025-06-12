package code15_9;

public class Main {

	public static void main(String[] args) {
		final String FORMAT="%-9s %-13s 所持金%,6d";
		Hero[] hary=new Hero[3];
		Hero h=new Hero("minato","無職",230);
		Hero h2=new Hero("asaka","無職",130);
		Hero h3=new Hero("sugawara","無職",40);
		hary[0]=h;
		hary[1]=h2;
		hary[2]=h3;
		
		for(Hero a:hary) {
			String sh = String.format(FORMAT,a.getName(),a.getJob(),a.getGold());
			System.out.println(sh);
		}
//		String s=String.format(FORMAT,h.getName(),h.getJob(),h.getGold());
//		String s2=String.format(FORMAT,h2.getName(),h2.getJob(),h2.getGold());
//		String s3=String.format(FORMAT,h3.getName(),h3.getJob(),h3.getGold());
//		System.out.println(s);
//		System.out.println(s2);
//		System.out.println(s3);
	}
}
