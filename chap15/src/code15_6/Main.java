package code15_6;

public class Main {
	
//	正規表現＜.matches()＞
//	boolean型
//	このメソッドを呼び出したインスタンスを引数で参照して検査する
//	通常の文字列で完全一致
//	「.」は任意の文字を意味し「*」は直前の文字の任意の数まで繰り返しの検査をする
//	「.*」で任意の文字の繰り返し、つまり全ての文字列を許容することを意味する
 
	 public static boolean isValName(String name) {
			return name.matches(/*"[A-Z][A-Z0-9]{7}"*/"M.*");}
public static void main(String[] args) {
	 String name="MINATO07aaaaaaa";
	 if(isValName(name)) {
		 System.out.println("ok");
	 }else {
		 System.out.println("no");
	 }

	}

}
