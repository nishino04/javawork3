package code14_10;
import static java.lang.System.*;
public class Hero {
	private  String name;
	private int hp;
	static int money=10000;
	
	public static void setRM() {//static メソッド new無しで呼び出せる
		Hero.money = (int)(Math.random()*1000);	
							//new Random().nextInt(1000);
							//と同じ
		System.out.println(/*this.name+*/"どもの所持金を初期化した");
		out.println(money);
						//エラー:コンテキストでは使用できない
						//	ここのthisはインスタンスを指すため、
						//インスタンスが存在しない可能性があるためエラーになる
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
