package list.list3;

public class Main2 {

	public static void main(String[] args) {
		Hero h =new Hero("minato",150);
		h.getItems().add(new Po("Potion",50));
		System.out.println(h.getItems().get(0));
	}

}
