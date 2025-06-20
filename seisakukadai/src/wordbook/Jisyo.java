package wordbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Jisyo {

	public static void touroku(Map<String,String>wds,Map<Integer,String>wl) {
		System.out.println("登録する言葉を入力してください");
		String str =new Scanner(System.in).nextLine();
		if(wds.containsKey(str)) {
			System.out.println("既に登録されています！");
			return;
		}
		System.out.println("登録する解説を入力してください");
		String des =new Scanner(System.in).nextLine();
		System.out.println("登録する言葉："+str);
		System.out.println("登録する解説："+des);
		char ch=Util.choice("これでよろしいですか？		y/n");
		if(ch=='y'||ch=='ｙ') {
			wds.put(str, des);	
		wl.put(wl.size(), str);
		Ymkk.kakikomi(wds);
		Ymkk.wlkaki(wl);
		System.out.println("登録完了しました");
		}else {
			System.out.println("登録をキャンセルしました");
			return;
		}
		
	}
	public static void itiran(Map<String,String>wds,Map<Integer,String>wl) {
			for(int i=0;i<wl.size();i++) {
				String s=wl.get(i);
				System.out.println("・"+wl.get(i)+"　…"+wds.get(s));
			}
		}
		
	
	
public static void Rndm(Map<Integer,String>wl,Map<String,String>wds) {
	System.out.println("現在の登録単語数は"+wl.size()+"です");
	int kazu=Util.choiceInt("表示する数を数字で入力してください	->");
	if(kazu>wl.size()) {
		System.out.println("数字が大きすぎます！");
		System.out.println("Topに戻ります");
		return;
	}else if(kazu==0) {
		System.out.println("不正な入力です、メニューに戻ります");
		return;
	}
	List<Integer>lis=new ArrayList<>();
	System.out.println("単語の表示を"+kazu+"回行います");
	int ii;
	for(int i=0;i<kazu;i++) {
		do{
			ii= new Random().nextInt(wl.size());
		}while(lis.contains(ii));
		lis.add(ii);
	}
	for(int i=0;i<lis.size();i++) {
		System.out.println((i+1)+"/"+lis.size());
		System.out.println('\n'+"単語："+wl.get(lis.get(i))+'\n');
		char ch= Util.choice("解説：１、次を表示：２	->");
		switch(ch) {
		case'１':
		case'1':
			System.out.println("解説："+wds.get(wl.get(lis.get(i))));
			ch= Util.choice("次を表示：eny->");
			break;
		case 2:
			break;
		default:
			break;
		}
		if(i+1==lis.size()) {
			System.out.println("設定された表示数を完了しました");
			ch= Util.choice("もう一度行いますか？	y/n");
			if(ch=='y'||ch=='ｙ') {
				Rndm(wl,wds);
			}else {
				System.out.println("ランダム表示を終了します");
				return;
			}
			
		}
			
		
		
}
}
}//class end


