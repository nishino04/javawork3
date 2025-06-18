package main;
	

public class Manager {
	Hero hero;
	Goblin gob;
	Slime sli;
	Potion p;
	Eather e;
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
			BattleManager.fight(hero, gob);
			if(gob.hp<=0) {
				board.map[gob.y][gob.x]='.';
			}
			break;
		case 's':
			System.out.println("suraimu！");
			BattleManager.fight(hero, sli);
			if(sli.hp<=0) {
				board.map[sli.y][sli.x]='.';
			}
			break;
		case'.':
			break;
		default:
			break;
		}
	}
	
	public void init() {
		System.out.println("Map上の敵を全て倒しましょう！");
		System.out.println("ゲームスタート！");
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
		this.e=new Eather("エーテル", 'e');
		e.setPosition(board);
	}
	
}
