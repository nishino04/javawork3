package janken;

import java.util.Scanner;

public class User extends Player {

	User(String s){
		this.name=s;
	}
	@Override
	public void janken(){
		System.out.println("どの手を出しますか？");
		System.out.println("0:グー 1:チョキ 2:パー");
		try {
			int i=new Scanner(System.in).nextInt();
			System.out.println(this.name+"は"+this.hands[i]+"を出した！");
			this.choice=i;
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("指定の数字を入力して…");
			janken();
		}
	}
}
