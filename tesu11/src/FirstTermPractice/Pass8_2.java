package FirstTermPractice;

public class Pass8_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String simei[] = {"田中　実","中村","鈴木　黎","山本","本田"};
		double tokutenn[] = {82.0,85.0,74.0,90.0,70.0};
		double heikin = 0;
		
		for(int i=0;i<5;i++) {
			System.out.print(simei[i]+ "\t");
		}
		System.out.println("平均");
		
		for(int i=0;i<5;i++) {
			System.out.print(tokutenn[i]+ "\t");
		}
		for(int i=0;i<5;i++) {
			heikin = heikin + tokutenn[i];
		}
		System.out.println(heikin/5);
	}

}
