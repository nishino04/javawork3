package janken;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Player {
	String name;
	String[] hands = { "グー", "チョキ", "パー" };
	int choice;
	List<String> rlt=new ArrayList<>();

	public void janken() {
		int i = new Random().nextInt(3);
		this.choice = i;
		System.out.println(this.name + "は" + this.hands[i] + "を出した");
		;
	}

	void rslt() {
		System.out.println(this.name + "の戦績は…,");
		for (String s : this.rlt) {
			System.out.print(s + ",");
		}
		System.out.println("\nです");
	}
}
