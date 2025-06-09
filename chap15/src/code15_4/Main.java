package code15_4;

public class Main {

	public static void main(String[] args) {
		long start= System.currentTimeMillis();
//		StringBuilder sb = new StringBuilder();
//		for(int i =0;i<100000;i++) {
//			if(i%20==0) {
//				sb.append("\n");
//			}
//			sb.append("java");
//		}
//		String s=sb.toString();
//		System.out.println(s);
		//41ミリ秒
//		
		String s ="";
		for(int i=0;i<=100000;i++) {
			if(i%2==0) {
			s=s+"_java";
			}else {
				s+="hello!_";
			}
			if(i%20==0&&i!=0) {
				s=s+"\n";
			}
		}
		System.out.print(s);
		long end=System.currentTimeMillis();
		System.out.println("処理時間"+(end - start)+"ミリ秒");
		//3234ミリ秒
//		この速度差は内部処理の違いによるもの
//		Stringは文字の追加するたびに新しいインスタンスを呼び出して
//		対応するため、繰り返しの数だけ処理を最初からやり直している。
//		StringBuilderは一度インスタンスを作成すると記憶領域（バッファ）に
//		データを随時格納できるため、格納時の処理だけで済む。
	}

}
