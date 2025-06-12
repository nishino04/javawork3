package code16_8;

import java.util.ArrayList;
import java.util.List;

class Hero {
	
	String name;
	String dsc;
	public Hero() {
		this.name="minato";
		dsc=this.name;
	}
	public String toString() {
		return dsc;
	}
}
public class Main {
	public static void main(String[] args) {
	Hero h=new Hero ();
	List<Hero> hs=new ArrayList<>();
	hs.add(h);
	h=new Hero();
	h.name="suga";
	hs.add(h);
	System.out.println(hs);
	}
}




