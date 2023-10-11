package myselfLogic;

public class Divination {
	public static void fortune() {
		int fortune = new java.util.Random().nextInt(5);
		fortune++;
		System.out.println(fortune);
	}
}
