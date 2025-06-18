package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character {
	int y;
	int x;
	int hp;
	int mp;
	String name;
	char suffix;
	List<Item>items;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
		this.mp = 50;
		this.items=new ArrayList<>();
	}

	public void setPosition(Board board) {
		this.y = new Random().nextInt(board.ysize);
		this.x = new Random().nextInt(board.xsize);
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "は" + m.name + "を攻撃した！");
		int damage = new Random().nextInt(30);
		m.hp -= damage;
		System.out.println(m.name + "に" + damage + "ポイントのダメージを与えた");
		
	}
	
	public void move(Board board,char ch) {
		switch (ch) {
		case 'w' -> {
			y = Math.max(y-1, 0);
		}
		case 's' -> {
			y = Math.min(y+1, board.ysize-1);
		}
		case 'a' -> {
			x = Math.max(x-1, 0);
		}
		case 'd' -> {
			x = Math.min(x+1, board.xsize-1);
		}
		}
	}
	public void select(Board b) {
		char ch =Util.choice("w↑ s↓ a← d→ t:take u:use i:info l:look > ");
		switch(ch) {
			case'w','s','a','d':
				move(b,ch);
			break;
			case'u':
				useItem();
				break;
			case'i':
				printInfo();
				break;
			default:
				break;
		}
	}
	/**
	 * y/n
	 * 引数
	 * 
	 */
	public boolean takeItem(Item i) {
		System.out.println(i.name+"が落ちていた");
		char ch=Util.choice("拾いますか？ y/n");
		/*switch(ch) {
			case'y':
				items.add(i);
				return '.';
			case'n':
				return b.map[this.y][this.x];
			default:
		
			return b.map[this.y][this.x];
		*/
		if(ch=='y') {
			System.out.println(i.name+"を手に入れた！");
			items.add(i);
			return true;
		}else {
			System.out.println(i.name+"を拾いませんでした");
			return false;
		}
	}
	char selectItem() {
		if(items.size()==0) {
			System.out.println("まだ何も持ってない…");
			return '9';
		}
		char ch='9';
		do {
			System.out.println("今持っているのは");
			for(int i=0;i<items.size();i++ ) {
				System.out.print("("+i+")");
				System.out.println(items.get(i).name);
			}
			String str="どれつかうん？\n";
			for(int i=0;i<items.size();i++) {
			str+=("("+i+")")+items.get(i).name;
			}
			str+="(9)つかわん";
			ch =Util.choice(str);
		}while (!isNum(ch)||!isValid(ch));
			return ch;
	}
	private boolean isNum(char ch) {
		if(ch>='0'&&ch<='9') {
			return true;
		}
		return false;
	}
	private boolean isValid(char ch) {
		int n=ch-'0';
		return n<items.size();
	}
	public void useItem() {
		char ch =selectItem();
		int num =ch-'0';
		if(ch=='9') {
			return;
		}
		if(items.get(num) instanceof Potion p) {
				this.hp=Math.min(this.hp+p.reHp, 100);
				p.reHp=0;
				System.out.println(this.name+"は"+p.name+"を使用した！");
				System.out.println("HPが回復し"+this.hp+"になった！");
				items.remove(num);
			}else if(items.get(num) instanceof Eather e) {
				this.mp=Math.min(this.mp+e.reMp, 50);
				e.reMp=0;
				System.out.println(this.name+"は"+e.name+"を使用した！");
				System.out.println("MPが回復し"+this.mp+"になった！");
				items.remove(num);
		}
	}
	public void printInfo() {
		String str="HP:"+this.hp+"MP:"+this.mp+"持ち物：";
		String s ="なし";
		if(!this.items.isEmpty()) {
		for(Item w:this.items) {
			str+=" "+w.name;
		}
			System.out.println(str);}
		else {
			System.out.println(str+s);}
		}		
}  // class end
