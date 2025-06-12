package set.code16_5;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> wds=new TreeSet<>();
		//System.out.println();
		wds.add("人間");
		wds.add("いぬ");
		wds.add("cat");
		wds.add("ウルフ");
		wds.add("山羊");
		wds.add("human");
		wds.add("おおかみ");
		wds.add("犬");
		wds.add("アリクイ");
		for(String s:wds ) {
			System.out.println(s);
		}

	}

}
