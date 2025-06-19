package main;

import java.util.Random;

public class Wizard extends Character{
	public Wizard(String name, char suffix) {
		super(name, suffix);
	}
	public Wizard() {
		this("勇者", '@');
	}
	
	String name;
	char suffix;
	
	@Override
	public void attack(Monster m) {
		int a =new Random().nextInt()+1;
		if(a%2!=0&&this.mp>=10) {
			super.fireball(m);
		}else {
			super.attack(m);
		}
	}

}
