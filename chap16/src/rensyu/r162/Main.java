package rensyu.r162;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<Hero> hs=new ArrayList<>();
		Hero h=new Hero("斎藤");
		Hero h2=new Hero("鈴木");
		hs.add(h);
		hs.add(h2);
		for(Hero s :hs) {
			System.out.println(s.getName());
		}
		Map<Hero,Integer> hs2 =new HashMap<>();
		hs2.put(h,3);
		hs2.put(h2, 7);
		for(Hero s:hs2.keySet()) {
			System.out.println(s.getName()+"が倒した敵＝"+hs2.get(s));
			
		}
	}

}
