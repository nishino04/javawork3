package rensyu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s=null;
		aa a=new aa();
		a.ww();
		try{s.length();
			
		}catch(NullPointerException e){
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("スタックトレース(ここから)");
			e.printStackTrace();
			System.out.println("スタックトレース(ここまで)");
		}

	}

}
class Main3{
	public static void main(String[] args) {
		while(aa.s==0) {
			aa.plz();
		}
	}
}
class aa{
	static int s=0;
	public void ww() {
		try {
		int i=Integer.parseInt("三");
		System.out.println(i);
		}catch(NumberFormatException e){
			System.out.println("NumberFormatExceptionを確認\n以下スタックトレース");
			e.printStackTrace();
			System.out.println("トレース終わり");
		}catch(Exception e) {
			System.out.println("error確認、以下スタックトレース");
			e.printStackTrace();
			System.out.println("トレース終わり");
		}
	}
	public static void plz() {
		System.out.println("正の数字を入力してください");
		try {
		String i =new Scanner(System.in).nextLine();
		
		if(Integer.parseInt(i)>=0) {
		System.out.println("あなたが入力した数字は"+i+"です");
		s++;}else {
			System.out.println("正数ではない…");
		}
		
		}catch(Exception e){
			System.out.println("数字入れろ");
		}
	}
}
