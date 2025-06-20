package wordbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ymkk {
	
	public static  List<String> yomikomi() {//テキストファイルを読み込んで行ごとに配列にする
		File f=new File(("Jisyo.txt"));
		FileReader fr=null;
		List<String> li=new ArrayList<>();
		if(f.exists()) {//上で宣言したファイル名のファイルがあるかチェック
			
			try {
				fr=new FileReader(f);
				//System.out.println(fr);//テスト用
				int ch =fr.read();
				StringBuilder sb=new StringBuilder();
				while(ch>-1) {//char配列から一つずつ取り出す
					if(ch!='\n') {
						sb.append((char)ch);
					}
//					System.out.println(sb);
					if(((char)ch)=='\n'||ch==0) {//改行を目印にして配列に収める
						String s=new String(sb);
						li.add(s);
						//System.out.println(sb);//テスト用
						sb=new StringBuilder();//中身をリセット
					}
					ch=fr.read();//次の文字へ
					if(ch==-1) {
						String s=new String(sb);
						li.add(s);
						}
				}
				try {
					fr.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				return li;
				
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}
		return li;
	}
	public static  List<String> wlyomi() {//テキストファイルを読み込んで行ごとに配列にする
		File f=new File(("wl.txt"));
		FileReader fr=null;
		List<String> li=new ArrayList<>();
		if(f.exists()) {//上で宣言したファイル名のファイルがあるかチェック
			
			try {
				fr=new FileReader(f);
				//System.out.println(fr);//テスト用
				int ch =fr.read();
				StringBuilder sb=new StringBuilder();
				while(ch>-1) {
					if(ch!='\n') {
						sb.append((char)ch);
					}//char配列から一つずつ取り出す
//					System.out.println(sb);
					if(((char)ch)=='\n') {//改行を目印にして配列に収める
						String s=new String(sb);
						li.add(s);
						//System.out.println(sb);//テスト用
						sb=new StringBuilder();//中身をリセット
					}
					ch=fr.read();//次の文字へ
					if(ch==-1) {
						String s=new String(sb);
						li.add(s);
					}
				}
				try {
					fr.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				return li;
				
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
		}
		return li;
	}

	public static void kakikomi(Map<String,String>wds){//Map<単語,解説>txtファイルに書き込み
		List<String> keys=new ArrayList<String>(wds.keySet());
		List<String>lis=new ArrayList<>();
		FileWriter fw=null;
		FileReader fr=null;
		String str;
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
			lis=Ymkk.yomikomi();
			str=Util.nuki(lis);
			fr=new FileReader(f);
			fw =new FileWriter(f);
			StringBuilder sb=new StringBuilder();
//			sb.append(str);
			for(int c=0 ;c<wds.size();c++) {
				String v=keys.get(c)+","+wds.get(keys.get(c));
				if(v.contains("\n")||(c==wds.size()-1&&c!=0)) {
					sb.append(v);
				}else {
				sb.append(v+"\n");
				}
			}
			fw.append(sb);
		} catch (IOException e) {
			// TODO 自動生成た catch ブロック
			e.printStackTrace();
		}finally{
			try {
			fw.close();
			fr.close();
		}catch(IOException e){
			
		}
		}
	}
	public static void wlkaki(Map<Integer,String>wl){//Map<単語,解説>txtファイルに書き込み
		List<String>lis=new ArrayList<>();
		FileWriter fw=null;
		FileReader fr=null;
		String str;
		File f=new File("wl.txt"); 
		if (f.exists()==false) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		try {
			lis=Ymkk.wlyomi();
			str=Util.nuki(lis);
			fr=new FileReader(f);
			fw =new FileWriter(f);
			StringBuilder sb=new StringBuilder();
//			sb.append(str);
			for(int c=0 ;c<wl.size();c++) {
				String v=c+","+wl.get(c);
				if(v.contains("\n")||(c==wl.size()-1&&c!=0)) {
					sb.append(v);
				}else {
				sb.append(v+"\n");
				}
			}
			fw.append(sb);
		} catch (IOException e) {
			// TODO 自動生成た catch ブロック
			e.printStackTrace();
		}finally{
			try {
			fw.close();
			fr.close();
		}catch(IOException e){
			
		}
		}
	}
	}
