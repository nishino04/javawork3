package seisakukadai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mng {
	Map<String,String>wds=new HashMap<>();
	Map<Integer,String>wl= new TreeMap<>();
	List<String>l=new ArrayList<>();
public void mng() {
	l=Ymkk.yomikomi();
	wds=Util.makeMap(l);
	System.out.println(wds.toString());
	l=Ymkk.wlyomi();
	wl=Util.makewl(l);
	System.out.println(wl.toString());
	System.out.println("起動しました");
	System.out.println("何をしますか？");
	while(true) {
	char i =Util.choice("１：単語登録\n２:登録単語の一覧表示\n３：ランダム表示\n４：データの削除");
	switch(i) {
	case '1':
		System.out.println("単語登録を開始します");
		Jisyo.touroku(wds,wl);
		break;
	case '2':
		System.out.println("単語と説明を一覧表示します。");
		Jisyo.itiran(wds,wl);
		break;
	case '3':
		System.out.println("ランダムに単語を表示します");
		break;
	case '4':
		System.out.println("データの削除を行います");
		Sakujo.sakujo();
		break;
	default:
		break;
	}
	}
}
}
