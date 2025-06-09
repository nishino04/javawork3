package code14_6;

public class Hero {
	private  String name;
	private int hp;
	static int money=10000;
	
	@Override
	public String toString() {
		return "名前:"+this.name+"/HP:"+this.hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
