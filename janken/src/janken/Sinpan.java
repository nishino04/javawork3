package janken;

public class Sinpan {
	public static void jgmnt(Player u,Player c) {
		if((u.choice+1)%3==c.choice) {
			System.out.println("あなたの勝ちです！");
			u.rlt.add("○");
			c.rlt.add("×");
		}else if(u.choice==c.choice) {
			System.out.println("あいこです");
			u.rlt.add("△");
			c.rlt.add("△");
		}else {
			System.out.println("あなたの負けです…");
			u.rlt.add("×");
			c.rlt.add("○");
		}
	}
}
