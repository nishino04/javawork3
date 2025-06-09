package code14_6;

public class Main {

	public static void main(String[] args) {
		Hero h1=new Hero();
		Hero h2=new Hero();
		h1.setName("みなと");
		h1.setHp(200);
		h2.setName("みなと");
		h2.setHp(200);
		if(h1.equals(h2)==true) {
			System.out.println("せや");
		}else {
			System.out.println("ちゃう");
		}

	}

}
