package wordbook;

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
	l=Ymkk.yomikomi();//wdsファイルの読み込み
	wds=Util.makeMap(l);//wdsファイルのMap変換
	//System.out.println(wds.toString());//テスト用
	l=Ymkk.wlyomi();//wlファイルの読み込み
	wl=Util.makewl(l);//wlファイルのMap変換
	//System.out.println(wl.toString());//テスト用
	System.out.println("起動しました");
	System.out.println("何をしますか？");
	while(true) {
	char i =Util.choice("\n１：単語登録\n２:単語の一覧表示\n３：ランダム表示\n４：データの削除");
	switch(i) {
	case'１':
	case '1':
		System.out.println("単語登録を開始します");
		Jisyo.touroku(wds,wl);
		break;
	case'２':
	case '2':
		System.out.println("単語と説明を一覧表示します。");
		Jisyo.itiran(wds,wl);
		break;
	case'３':
	case '3':
		System.out.println("ランダムに単語を表示します");
		Jisyo.Rndm(wl,wds);
		break;
	case'４':
	case '4':
		System.out.println("データの削除を行います");
		Sakujo.sakujo(wl,wds);
		break;
	default:
		break;
	}
	}
}
}
