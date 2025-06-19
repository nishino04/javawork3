package seisakukadai;

import java.io.File;

public class Sakujo {
	public static void sakujo() {
	char ch=Util.choice("保存されているデータを消しますがよろしいですか？ y/n");
	switch(ch) {
	case 'y':
		File jf =new File("Jisyo.txt");
		File wlf=new File("wl.txt");
		jf.delete();
		wlf.delete();
		System.out.println("データファイルをを削除しました");
		break;
	case 'n':
		System.out.println("データの削除をキャンセルしました");
		break;
	default:
		System.out.println("データの削除をキャンセルしました");
		break;
	}
	
}
}