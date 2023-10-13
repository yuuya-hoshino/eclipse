package mainHero;
import character.Hero;//インポート文は書く

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//int[] hairetu =new int[3];
		Hero yusya1 = new Hero();
		yusya1.sleep();
		yusya1.name="AKIRA";
		yusya1.sleep();
		yusya1.sit(1);
		yusya1.silp();
		yusya1.silp();
		yusya1.run();
		
		Hero yusya2 = new Hero();
		yusya2.name="MANABU";
		yusya2.sleep();
	}

}
