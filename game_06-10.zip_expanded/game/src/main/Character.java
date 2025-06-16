package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Character {
	int y;
	int x;
	int hp;
	String name;
	char suffix;
	List<Item>items;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
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
	public void useItem() {
		if(items.size()==0) {
			System.out.println("まだ何も持ってない…");
			return;
		}
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
		System.out.println(str);
	}
}  // class end
