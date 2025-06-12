package list.code16_1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> ps=new ArrayList<Integer>();
		ArrayList<Integer> ps2=new ArrayList<Integer>();
		ArrayList<Integer> ps3=new ArrayList<Integer>();
		//Integer型でArrayListを宣言
		ps.add(10);
		ps.add(100);
		ps.add(1000);
		//数値を追加すると自動的にInteger型になっている
		for(int i :ps) {
		//拡張for文も使用可能
			System.out.println(i);
		}
		Integer i1=Integer.valueOf(9);
		ps2.add(i1);
		Integer i2=Integer.valueOf(99);
		ps2.add(i2);
		Integer i3 = Integer.valueOf(999);
		ps2.add(i3);
		for (Integer s:ps2) {
			System.out.println(s);
		}
		ps3.add(Integer.valueOf(11));
		ps3.add(Integer.valueOf(111));
		ps3.add(Integer.valueOf(1111));
		System.out.println(ps3);
		for(Integer i:ps3) {
			System.out.println(i);
		}
}
}
