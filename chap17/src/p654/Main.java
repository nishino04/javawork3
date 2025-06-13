package p654;

public class Main {

	public static void main(String[] args) {
		String flname="music.mp99";
		try{if(!(flname.endsWith("mp3"))&&!(flname.endsWith("mp4"))) {
			throw new UnsupportedMusicFileException("未対応のファイルぞ");}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
	class UnsupportedMusicFileException extends Exception{
		public UnsupportedMusicFileException(String msg) {
			super(msg);
		}
	}


