package janken;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean rep =true;
		System.out.println("じゃんけんゲームを始めます");
		System.out.println("プレイヤー名を入力してください　->");
		String name=new Scanner(System.in).nextLine();
		System.out.println("じゃんけんを始めます!");
		User use=new User(name);
		Com com=new Com();
		do {
			use.janken();
			com.janken();
			Sinpan.jgmnt(use,com);
			use.rslt();
			com.rslt();
			System.out.print("もう一度しますか？y/n ->");
			String yn=new Scanner(System.in).nextLine();
			if(yn=="n") {
				rep=false;
			}
		}while(rep==true);
		
	}
}
