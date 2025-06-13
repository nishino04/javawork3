package p652;

public class Main {

	public static void main(String[] args) {
	per p =new per();
		p.setAge(-55);

	}
	}

	class per{
		int age;
	public void setAge(int i) throws IllegalArgumentException{
		if(i<0) {
			throw new IllegalArgumentException
			("年齢は0歳以上で入力しろ。指定値="+i+"は不正値");
		}
		this.age=i;
		System.out.println("お前は"+this.age+"歳だ");
	}
	}


