package list.list3;

public class Et extends Item{
	private int mp;
	private String desc;
	public Et(String name,int mp) {
		super(name);
		this.mp=mp;
		this.desc="魔力薬。使用するとMPを"+this.mp+"回復する";
	}
	@Override
	public String toString() {
		
		return getName()+"："+desc;
	}
	public String getDesc() {
		return this.desc;
	}
	

}
