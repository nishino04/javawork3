package seisakukadai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Jisyo {
	Map<Integer,String> wl=new TreeMap<>();
	Map<String,String> wds=new HashMap<>();
public static void touroku() {
	Map<Integer,String> wl=new TreeMap<>();
	Map<String,String> wds=new HashMap<>();
	System.out.println("登録するワードを入力してね！");
	String str =new Scanner(System.in).nextLine();
	System.out.println("登録する解説を入力してね！");
	String des =new Scanner(System.in).nextLine();
//	System.out.println("登録する解説の数を1～4で入力してね！");
//	int kazu =new Scanner(System.in).nextInt();
//	if(kazu<=4&&kazu!=0) {
//		int s=0;
//		desc=new ArrayList<>();
//		while(kazu>0) {
//			System.out.println("あと"+kazu+"回説明文を入力してね！");
//			String des =new Scanner(System.in).nextLine();
//			desc.add(des);
//			kazu--;
//		}
	wds.put(str, des);	
	wl.put(wl.size(), str);
	System.out.println("登録完了しました！");
	}
}



