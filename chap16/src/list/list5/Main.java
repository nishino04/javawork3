package list.list5;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	static ArrayList<String> nms = new ArrayList<>();
 public static void main(String[] args) {
	 nms.add("minato");
	 nms.add("asaka");
	 nms.add("sugawara");
	 nms.add("nukayama");
	 nms.add("mita");
	 Iterator<String>it=nms.iterator();
	 while(it.hasNext()) {
		 //	hasNext()は次の要素が存在するか判定する
		 //初期位置は0の左側で、位置を指定すると指定要素の左側に生成される
		 //next()で次の要素==右側の要素を指定し、内容を返す
		 String s= it.next();
		 System.out.println(s);
	 }
	 
 }
 public static void LinkedList() {
	 //LinkedList
	 //添え時による位置指定ではなく、要素に前後データの指定を付属することで列とする
	 //外見上はarrayListと変わらないが、要素が数珠つなぎになっており数字で位置を直接指定できない
	 //数字nを引数にしたとき、先頭のデータからn番目まで参照を繰り返して取り出すことになる
	 
 }
}
