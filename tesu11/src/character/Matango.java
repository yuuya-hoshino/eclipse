package character;

public class Matango {
	public int hp = 50;
	final int LEVEL =10;
	public char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
	}
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h){
		System.out.println("キノコ"+this.suffix+"の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
