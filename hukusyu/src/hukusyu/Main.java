package hukusyu;

public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅" + a + "横幅" + b + "の長方形の面積は、" + c);
		System.out.println("""
				古いアルバムめくり
				ありがとうってつぶやいた
				いつもいつも胸の中
				励ましてくれる人よ

				晴れ渡る日も雨の日も
				浮かぶあの笑顔
				思い出遠くあせても
				面影探して
				よみがえる日は涙そうそう
				""");
		String x="a+bは";
		System.out.println(x+(a+b));
		int w=60;
		int i=0;
		while(i<10) {
			System.out.print(i);
			i++;
		}
		System.out.println("");
		i=0;
		do {
			System.out.print(i);
			i++;
		}while(i<10);
		System.out.println("");
		for(int s=0;s<10;s++) {
			System.out.print(s);
		}
		int[] is=new int[10];
		is[9]=10;
//		int[]is2=is;
//		System.out.println(is2[0]);
		System.out.println(is[9]);
		
//		System.out.println(is[0]);
//		System.out.println(is2[0]);
//		System.out.println(is2[1]);
//		System.out.println(is2[2]);
//		System.out.println(is2[3]);
//		System.out.println(is2[4]);
//		System.out.println(is2[5]);
//		System.out.println(is2[6]);
//		System.out.println(is2[7]);
//		System.out.println(is2[8]);
//		System.out.println(is2[9]);
		int[]aa=new int[4];
}
}