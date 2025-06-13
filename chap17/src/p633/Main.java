package p633;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		var m=new TreeMap<String,String>();
		m.put("a","tarou");
		String str=null;
		try {
				FileWriter fw=new FileWriter("data.txt");
				fw.write(str);
				fw.close();
				System.out.println("kakikonda");
		}catch(IOException e){
			System.out.println("miss");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("null");
			e.printStackTrace();
		}
		

	}

}
