package set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> cls=new HashSet<>();
		cls.add("赤");
		cls.add("青");
		cls.add("黄");
		cls.add("赤");
		System.out.println("色は"+cls.size()+"種類ある");
	}

}
