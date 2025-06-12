package rensyu15_2;

public class Make {
	public static String make(String fo,String fi) {
		if(fo.contains("\\")) {
			if(fo.startsWith("\\")) {
				if(fo.endsWith("\\")) {
					return fo+fi;
				}else {
					return fo+"\\"+fi;
				}
			}else {
				return "\\"+fo+fi;
			}
		}else {
			
		return "\\"+fo+"\\"+fi;
		}
	}
}
