package wordbook;

import java.io.File;
import java.util.Map;

public class Sakujo {
	public static void sakujo(Map<Integer,String>wl,Map<String,String>wds) {
		System.out.println("削除方法を選択してください");
		char i=Util.choice("１：単語を選択肢して削除\n２：全データの削除\n３：キャンセル");
		switch(i) {
		case '1':
			System.out.println("削除する単語を選択してください");
			for(int i2=0;i2<wl.size();i2++) {
				System.out.println("登録番号["+i2+"]："+wl.get(i2));
			}
			int i2=Util.choiceInt("削除したい単語の登録番号を入力してください");
			
			System.out.println("登録番号["+i2+"]-"+wl.get(i2)+"を削除します");
			char c=Util.choice("よろしいですか？　y/n");
			switch(c) {
			case 'y':
				String s=wl.remove(i2);
				wds.remove(s);
				int size=wl.size();
				for(int v=i2;v<wl.size();v++) {
					if(v<size){
					wl.put(v, wl.get((v+1)));}
				}
				if(i2!=size) {
					wl.remove(wl.size()-1);
				}
				System.out.println("登録番号["+i2+"]を削除しました");
				Ymkk.wlkaki(wl);
				Ymkk.kakikomi(wds);
				break;
			case 'n':
				break;
		}
			break;
		case '2':
			char ch=Util.choice("保存されている全データを消しますがよろしいですか？ y/n");
			switch(ch) {
			case 'ｙ':
			case 'y':
				File jf =new File("Jisyo.txt");
				File wlf=new File("wl.txt");
				jf.delete();
				wlf.delete();
				Ymkk.wlkaki(wl);
				Ymkk.kakikomi(wds);
				System.out.println("データファイルをを削除しました");
				System.out.println("メニューを表示します");
				break;
			case'ｎ':
			case 'n':
				System.out.println("データの削除をキャンセルしました");
				System.out.println("メニューを表示します");
				break;
			default:
				System.out.println("データの削除をキャンセルしました");
				System.out.println("メニューを表示します");
				break;
		}
			break;
		default:
			System.out.println("データの削除をキャンセルしました");
			System.out.println("メニューを表示します");
			break;
			
		}
		return;
		
	
}
}