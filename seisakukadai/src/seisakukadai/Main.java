package seisakukadai;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		FileWriter fw=null;
		Jisyo j=new Jisyo();
		j.touroku();
		List<String> s=new ArrayList<String>(j.aa.keySet());
		System.out.println(s.get(0));
		System.out.println(j.aa.get(s.get(0)));
		System.out.println(j.wl.get(0));
	
	File f=new File("Jisyo.txt"); 
	if (f.exists()==false) {
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	try {
		fw =new FileWriter(f);
		fw.write("{"+s.get(0)+","+j.aa.get(s.get(0))+"}");
	} catch (IOException e) {
		// TODO 自動生成た catch ブロック
		e.printStackTrace();
	}finally{
		try {
		fw.close();
	}catch(IOException e){
		
	}

}
}
}
