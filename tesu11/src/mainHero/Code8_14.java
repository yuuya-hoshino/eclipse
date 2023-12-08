package mainHero;
import character.Hero;//インポート文は書く
import character.Matango;//インポート文は書く

public class Code8_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m1.hp = 48;
		m1.suffix = 'B';
		
		h.sleep();
		m1.run();
		m2.run();
		h.run();
	}

}
