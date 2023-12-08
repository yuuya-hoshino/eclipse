package mainHero;
import character.SuperHero;//インポート文は書く
import character.HyperHero;//インポート文は書く

public class Code10_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SuperHero sh = new SuperHero();
		sh.run();
		
		sh.fly();
		sh.land();
		
		HyperHero hh = new HyperHero();
		hh.teleport();
		hh.flyLandSit(5);
		
	}

}
