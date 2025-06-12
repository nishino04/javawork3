package list.list3;

public class Po extends Item{
	private int hp;
	private String desc;
	public Po(String name,int hp) {
		super(name);
		this.hp=hp;
		this.desc="回復薬。使用するとHPを"+this.hp+"回復する";
		// TODO 自動生成されたコンストラクター・スタブ
	}
	@Override
	public String toString() {
		
		return getName()+":"+desc;
	}
	public String getDesc() {
		return this.desc;
	}

	
}
