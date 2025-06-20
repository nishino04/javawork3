package wordbook;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Util {
	
	public static char choice(String s) {//選択肢用メソッド…数字入力
		System.out.println(s);
		char ch =new Scanner(System.in).next().charAt(0);
		return ch;
	}
	public static int choiceInt(String s) {//選択肢用メソッド…数字入力
		System.out.println(s);
		try{
			int i =new Scanner(System.in).nextInt();
		
		return i;
		}catch(InputMismatchException e){
			int d=0;
			return d;
		}
	}
	public static String nuki(List<String> l){//配列を文字列に変換する
		StringBuilder s=new StringBuilder();  
		for(int i=0;i<l.size();i++){
		    s.append(l.get(i));
		  }
		return new String(s);
	}
	public static Map<String,String> makeMap(List<String> s){//リストを分解してMapに入れなおす
		String ss;
		Map<String,String> m=new HashMap<>();
		for(int i=0;i<s.size();i++) {
			ss=s.get(i);
			String[]lis=ss.split("[,]");
			m.put(lis[0],lis[1]);
			}
		return m;
	}
	public static Map<Integer,String> makewl(List<String> s){//リストを分解してMapに入れなおす
		String ss;
		String s2;
		Map<Integer,String> m=new HashMap<>();
		for(int i=0;i<s.size();i++) {
			ss=s.get(i);
			String[]lis=ss.split("[,]");
			s2=lis[0];
			Integer sss=Integer.parseInt(s2);
			m.put(sss,lis[1]);
			}
		return m;
	}



}

