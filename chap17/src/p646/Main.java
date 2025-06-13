package p646;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
//		sub("ｲﾇｩ");//throwsで押しつけられているので例外処理の
		//trycatch文が必要
	}
		public static void sub(String s) throws Exception {
//			try{
//				fwrite(s);
//			}catch(Exception e) {
//				System.out.println("E");
//			}
			fwrite(s);
		}
		public static void fwrite(String s) throws Exception{
//			try(FileWriter fw =new FileWriter("data2.txt");){
//				fw.write(s);;
//			}catch(Exception e){
//				System.out.println("エラー発生");
//			}
			FileWriter fw =new FileWriter("data2.txt");
			fw.write(s);
			fw.close();
		}
		public static void fappend(String s) throws Exception{
//			try(FileWriter fw =new FileWriter("data2.txt");){
//				fw.append(s);
//			}catch(Exception e) {
//				System.out.println("error!");
//			};
			FileWriter fw =new FileWriter("data2.txt");
			fw.append(s);
			fw.close();
			
		}

	}


