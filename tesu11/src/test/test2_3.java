package test;

public class test2_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageSting = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageSting);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました");
		System.out.println("あなたの年齢を入力してください");
	}

}
