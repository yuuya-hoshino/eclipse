package mainHero;
import character.Hero;//インポート文は書く

public class Code8_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者は" + h.name + "を生み出しました");
		
		h.sit(5);
		h.sleep();
		h.sit(25);
		h.run();
	}

}
