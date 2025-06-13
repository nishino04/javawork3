package ouyou;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		num=numget.inNum();
		System.out.println("入力された数字"+num+"を変数numに代入しました");
	}
}
class numget{
	static int r=0;
	static int i;
	public static int inNum() {
		System.out.println("数字を入力してください");
		while(r==0) {
		String s =new Scanner(System.in).nextLine();
		try {
			i=Integer.parseInt(s);
			r++;
		}catch(Exception e) {
			System.out.println("数字を入力してください！");
		}
		}
		return i;
		}

}
