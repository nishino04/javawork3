package seisakukadai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Jisyo {
	Map<Integer, Map<String,List<String>>> wl=new HashMap<>();
	List<Map<String,String>> tango=new ArrayList<>();
	Map<String,List<String>> aa=new HashMap<>();
	List<String> desc;
public void touroku() {
	System.out.println("登録するワードを入力してね！");
	String str =new Scanner(System.in).nextLine();
	System.out.println("登録する解説の数を1～4で入力してね！");
	int kazu =new Scanner(System.in).nextInt();
	if(kazu<=4&&kazu!=0) {
		int s=0;
		desc=new ArrayList<>();
		while(kazu>0) {
			System.out.println("あと"+kazu+"回説明文を入力してね！");
			String des =new Scanner(System.in).nextLine();
			desc.add(des);
			kazu--;
		}
	aa.put(str, desc);	
	wl.put(wl.size(), aa);
	System.out.println("登録完了！");
	}
}

}
