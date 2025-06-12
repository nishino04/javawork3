package code15_7;

public class Main {

	public static void main(String[] args) {
		String s ="abc,efg:hij";
		String[] ws=s.split("[,:]");//json読み取りにつかえる
		for (String w:ws) {
			System.out.println(w+"->");
		}
	}

}
