package p634;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("data.txt");
			fw.write("heyhey!");
			
		}catch(Exception e){
			//親クラスExceptionは大雑把にエラーを受け取れるが
			//詳細がわからない
			//getMessage()で取り出すのが有効だが
			//catchを複数にしたほうがわかりやすいかも
			System.out.println("何らかのエラー！");
			System.out.println(e.getClass());
		}finally{
			try {if(fw!=null) {
				fw.close();
				System.out.println("closeOk");}
			} catch (NullPointerException  | IOException e) {
				System.out.println("closeError");
				Object s= e.getClass();
				System.out.println(s);
				if(e instanceof NullPointerException) {
					
					System.out.println("Nullerror!!");
				}else {
					System.out.println("IOError!!");
				}
				e.printStackTrace();
			}
		}
	}

}
