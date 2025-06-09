package code15_1;

public class Main {

	public static void main(String[] args) {
		String s1= "スッキリJava";
		String s2= "Java";
		String s3= "java";
		String s4="";
		String s5=null;
		if(s2.equals(s3)) {
			System.out.println("s2とs3は同じ");
		}else {
			System.out.println("s2とs3おなじちゃうで");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しないと同じ");
		}
		System.out.println("s1の文字数は"+s1.length()+"や");
		if(s4.isEmpty()) {
			System.out.println("「"+s4+"」"+"これは空白。空文字は一応文字列なのでnullではない");
		}
		if(s5==null) {
			System.out.println("「"+s5+"」"+"これはnull。不正値です");
		}
	}

}
