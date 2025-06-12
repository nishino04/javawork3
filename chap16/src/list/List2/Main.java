package list.List2;

import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) {
		ArrayList<String> nms=new ArrayList<>();
		if(nms.size()==0) {
			System.out.println("空");
		}
		if(nms.isEmpty()) {
			System.out.println("まだ空");
		nms.add("minato");
		nms.add("asaka");
		nms.add("sugawara");
		nms.add(0,"suzuki");
		nms.set(2, "kamon");
		nms.add("suzuki");
		System.out.println("追加した");
		}
		System.out.println("お探しの名前は？");
		String s=new java.util.Scanner(System.in).nextLine();
		if(nms.contains(s)) {
			System.out.println(s+"はある");
			System.out.println(s+"は"+(nms.indexOf(s))+"番目に記録されている");}
		else{
			System.out.println(s+"はないぞ");
			System.out.println(s+"は"+(nms.indexOf(s))+"番目に記録されている");
			//存在しないデータをindexOf()すると-1が返ってくる。
		}
		//全削除はclear() int番目を指定削除はremove(int)
		System.out.println(nms);
		System.out.println("このsuzukiを消す");
		nms.remove("suzuki");
		System.out.println(nms);
		System.out.println("もう一度suzukiを消す");
		
		nms.remove("suzuki");
		//remove()は要素を記述して消すこともできる
		//引数の要素が複数存在する場合恐らく頭から順に消えていく
	System.out.println(nms);
	//ArrayList s <>()のメソッド
//	add(n),add(int,n)追加。引数intで割り込み登録
//	set(int,n)引数intの場所に上書き。
//	get(int)引数intの要素を取り出す
//	size()要素数を取り出す。-1でindexの数字になる
//	isEmpty()boolean型。中身が空か検査する
//	contains(n)ｎが要素に含まれるか検査する
//	indexOf(n)ｎが何番目にあるか検査
//	clear()要素全削除
//	remove(int),remove(n)引数intで指定した場所の要素削除
//				引数nでリスト先頭側にある要素ｎを削除
//	iterator()
	
	int a= new java.util.Random().nextInt(nms.size()-1);
	System.out.println(nms.get(a));
	printAll(nms);
}
	public static void printAll(ArrayList<String> nms) {
		for(String name:nms) {
			System.out.println("\n"+name);
		}
	}
}