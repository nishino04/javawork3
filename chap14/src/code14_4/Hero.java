package code14_4;

public class Hero {
	  String name;
	 int hp;
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {return true;}
		if(o instanceof Hero h){
			if(this.name.equals(h.name)){
				return true;
			}
		}
		return false;
	}
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
