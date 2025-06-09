package rensyu2;
import java.util.Random;

public class Crelic {
	
		String name;
		int hp=50;
		static final int Mhp=50;
		int mp=10;
		static final int Mmp=10;
		public void selfaid() {
			System.out.println(this.name+"は回復魔法を唱えた！HPを"+Mhp+"まで回復！");
			mp -=5;
			hp=Mhp;
			System.out.println("MPが"+mp+"になった！");
		}
		public int pray(int sec) {
			int x = sec + new Random().nextInt(3);
			int oldmp=mp;
			mp += x;
			if(mp>Mmp) {
				mp=Mmp;
			}
			System.out.println(this.name+"は"+sec+"秒の間祈りを捧げた！");
			//System.out.println("MPが"+mp+"になった！");
			return mp-oldmp;
		
		
	}

}
