package seisakukadai;

import java.util.Map;
import java.util.Scanner;

public class Jisyo {
//	Map<Integer,String> wl=new TreeMap<>();
//	Map<Integer,List<String>> wls=new TreeMap<>();
//	Map<String,String> wds=new HashMap<>();
	public static void touroku(Map<String,String>wds,Map<Integer,String>wl) {
		System.out.println("登録するワードを入力してね！");
		String str =new Scanner(System.in).nextLine();
		if(wds.containsKey(str)) {
			System.out.println("もうあるぞ");
			return;
		}
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
		Ymkk.kakikomi(wds);
		Ymkk.wlkaki(wl);
		System.out.println("登録完了しました！");
	}
	public static void itiran(Map<String,String>wds,Map<Integer,String>wl) {
			for(int i=0;i<wl.size();i++) {
				String s=wl.get(i);
				System.out.println("・"+wl.get(i)+"　…"+wds.get(s));
			}
		}
		
	
	}




