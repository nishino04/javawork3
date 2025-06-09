package rensyu1;

public class Ginkou {
	String accountNumber;
	int balance;
	@Override
	public String toString() {
		return "￥"+this.balance+"(口座番号:"+this.accountNumber+")";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Ginkou a) {
			String s=this.accountNumber;
			String s2=a.accountNumber;
			if(s.trim().equals(s2.trim())) {
				return true;
			}
		}
		
		return false;
	}
}
