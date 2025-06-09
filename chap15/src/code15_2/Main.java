package code15_2;

public class Main {

	public static void main(String[] args) {
		//文字の検索
		String s1="java and javascript";
		if(s1.contains("java")) {
			System.out.println("文字列s1はjavaを含んでる");
		}
		if(s1.startsWith("java")) {
			System.out.println("文字列s1の最初にjavaあるよ");
		}else {
			System.out.println("文字列s1の最初にjavaないよ");
		}
		if(s1.endsWith("java")) {
			System.out.println("文字列s1の末尾にjavaあるよ");
		}else {
			System.out.println("文字列s1の末尾にjavaないよ");
		}
		System.out.println("文字列s1で最初にvが登場する位置は"+s1.indexOf("v"));
		System.out.println("文字列s1で最後にaが登場するのは"+s1.lastIndexOf("a"));

	}

}
