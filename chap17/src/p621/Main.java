package p621;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("data.txt");
		fw.write("hey");
		fw.close();
		System.out.println("ok");
		}catch(IOException e){
			//IOExceptionはファイル読み込み関連エラーの抽象クラス
			//子クラスはぶんｄjava.io.FileNotFoundExceptionなど
			System.out.println("errar");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
