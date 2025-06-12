package map.code16_7;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String,Integer>prefs=new HashMap<>();
		prefs.put("京都", 255);
		prefs.put("東京", 1621);
		prefs.put("熊本", 182);
		prefs.put("大阪", 1500000);
		for(String s:prefs.keySet()) {
			int Val=prefs.get(s);
			System.out.println(s+":"+Val);
		}
		System.out.println("Map内のランダム表示");
		int v=0;
		int a=new java.util.Random().nextInt(prefs.size()-1);
		for(String s :prefs.keySet()) {
			
			if(a==v) {;
				System.out.println(s+":"+prefs.get(s));
			}
			v++;
			}

	}

}
