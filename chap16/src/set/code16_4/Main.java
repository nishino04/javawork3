package set.code16_4;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set <String> cls=new HashSet<>();
		System.out.println();
		cls.add("青");
		cls.add("赤");
		cls.add("黄");
		for(String s:cls) {
			System.out.println(s);
		}
	}

}
