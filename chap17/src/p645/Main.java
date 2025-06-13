package p645;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		String Null=null;
		try (FileWriter f =new FileWriter("data2.txt");){
			f.write(Null);
		}catch(Exception e) {
			System.out.println("なんらかのエラーが発生しました");
		}

	}

}
