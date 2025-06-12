package list.list3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		final String fmt="%-9s %-13s";
		
		
//		herosというリストを作成する
//		minatoとasaka、sugawaraの３名をhp100で作成する
//		一覧表示する
	Hero h=new Hero("minato",100);
	Hero h2=new Hero("asaka",100);
	Hero h3=new Hero("sugawara",100);
	ArrayList<Hero> hs=new ArrayList<>();
	hs.add(h);
	hs.add(h2);
	hs.add(h3);
	for(Hero i:hs) {
		System.out.println(i);
	}
	ArrayList<Item> Is=new ArrayList<>();
	Item a=new Po("potion",50);
	Is.add(a);
	Is.add(new Et("Ether",50));
	for (Item i:Is) {
		System.out.println(i.getName()+":"+i.getDesc());
	}
	String s =String.format(fmt,"tarou","atatatatata");
	System.out.println(s);
	}

}
