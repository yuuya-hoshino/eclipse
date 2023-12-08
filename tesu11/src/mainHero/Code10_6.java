package mainHero;
import character.Hero;
import character.SuperHero;//インポート文は書く
import character.HyperHero;//インポート文は書く

public class Code10_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.run();
		
		SuperHero sh = new SuperHero();
		sh.hide();
		sh.appear();
		
		HyperHero hh = new HyperHero();
		hh.hide();
		hh.appear();
	}

}
