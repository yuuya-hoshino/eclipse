package test2;

public class test5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String a = "はい、大丈夫です。";
		String b = "akira@gmail.com";
		String c = "特にこだわりはないですが、スマホアプリの開発の知識がないので、出来ればバックエンドの方がいいです。";
		email(a,b,c);
		email(b,c);
	}
	public static void email(String a,String b,String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void email(String b,String c) {
		System.out.println("無題");
		System.out.println(b);
		System.out.println(c);
	}

}
