package list.list3;

public abstract class Item {
	private String name;
	public Item(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
		
	}
	public abstract String getDesc();
	public abstract String toString();
}
