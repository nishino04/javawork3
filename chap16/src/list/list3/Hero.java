package list.list3;

import java.util.ArrayList;
import java.util.List;

public class Hero {
	private String name;
	private int hp;
	private int Mhp;
	private List<Item> Items;
	public Hero(String n,int p) {
		this.name=n;
		this.hp=p;
		this.Mhp=p;
		this.Items=new ArrayList<>();
	}
	public String toString() {
		return "名前:"+name+"|HP："+hp+"/"+Mhp;
	}
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getMhp() {
		return Mhp;
	}
	public List<Item> getItems() {
		return Items;
	}
}
