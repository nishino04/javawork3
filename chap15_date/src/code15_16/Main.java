package code15_16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		//文字列からLocalDateを作成
	DateTimeFormatter fmt=DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate ld= LocalDate.parse("2025/12/16",fmt);
	System.out.println(ld);
	//1000日後を計算
	LocalDate ld2=ld.minusDays(100002);
	System.out.println(ld2);
	String str=ld.format(fmt);
	System.out.println(str);
	
	//現在時刻との比較
	LocalDate now=LocalDate.now();
	if(now.isAfter(ld2)){
		System.out.println("本日はその日より未来です");
	}
	System.out.println(now);
	}

}
