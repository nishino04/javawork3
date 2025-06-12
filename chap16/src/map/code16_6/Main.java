package map.code16_6;

import java.util.HashMap;
import java.util.Map;

public class Main {
//HashMap...java版連想配列キーと値のセットで格納する
//	Map<キーの型,値の型>Map変数名=new HashMap<>();
//	Setと同じくMapはインターフェイス、子クラスにHashMap
//	
//	HashMapのメソッド
//	put(x,y)データの追加。キーと値を入力する。値は同値可、キー重複は不可
//	get(x)データの取得。引数はキーで数値は非対応
//	size()中身のペア数。戻りはint
//	isEmpty()中身があるか判定。boolean
//	containsKey(x)引数がキーに含まれるか判定する
//	containsValue(y)引数が値に含まれるか判定
//	clear()全消去
//	remove(x)指定キーを持つペアの削除
//	KeySet()キー一覧を返す
	public static void main(String[] args) {
		Map<String,Integer>prefs=new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("大阪府", 8200000);
		prefs.put("熊本県", 182);
		int tky=prefs.get("東京都");
		System.out.println("東京都の人口は"+tky);
		prefs.remove("京都府");
		prefs.put("熊本県",181);
		if(prefs.containsKey("京都府")) {
			System.out.println("京都あるよ");
		}else {
			System.out.println("京都ないよ");
		}
		System.out.println(prefs);

	}

}
