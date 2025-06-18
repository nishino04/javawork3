package main;

public class Board {
	int ysize;
	int xsize;
	char[][] map;
	
	public Board(int ysize, int xsize) {
		this.ysize = ysize;
		this.xsize = xsize;
		map = new char[this.ysize][this.xsize];
	}
	public Board() {
		this(5, 5);
	}
	public void makeMap() {
		for (int y = 0; y < ysize; y++) {
			for (int x = 0; x < xsize; x++) {				
				map[y][x] = '.';
			}
		}
	}
	public void printMap(Character c) {
		for (int y = 0; y < ysize; y++) {
			System.out.print("|");
			for (int x = 0; x < xsize; x++) {
				if (y == c.y && x == c.x) {
					System.out.print(c.suffix + "|");
				} else {
					System.out.print(map[y][x] + "|");
				}
			}
			System.out.println();
		}
	}
}
