package main;
	

public class Manager {
	Hero hero;
	Goblin gob;
	Slime sli;
	Potion p;
	eather e;
	Board board;
	public void start() {
		init();
		while(hero.hp>0) {
			board.printMap(hero);
			checkHere();
			hero.select(board);
		}
	}
	public void checkHere() {
		char ch=board.map[hero.y][hero.x];
		switch(ch) {
		case 'p':
			if(hero.takeItem(this.p)==true) {
				board.map[hero.y][hero.x]='.';
			}break;
		case 'e':
			if(hero.takeItem(e)==true) {
				board.map[hero.y][hero.x]='.';
			}break;
		case 'g':
			System.out.println("ゴブ出現");
			break;
		case 's':
			System.out.println("suraimu！");
			break;
		case'.':
			break;
		default:
			break;
		}
	}
	
	public void init() {
		this.board = new Board();
		board.makeMap();  // マップ作成
		this.gob  = new Goblin();
		gob.setPosition(board);
		this.sli = new Slime();
		sli.setPosition(board);
		this.hero = new Hero();
		hero.setPosition(board);
		this.p=new Potion("ポーション", 'p');
		p.setPosition(board);
		this.e=new eather("エーテル", 'e');
		e.setPosition(board);
		board.printMap(hero);
	}
	
}
