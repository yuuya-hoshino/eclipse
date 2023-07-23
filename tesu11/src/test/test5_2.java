package test;

public class test5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title = "aaaa";
		String address = "aaaa@aaaa";
		String text = "aaaaaaaaaa";
		email(title,address,text);
		email(address,text);
	}
	public static void email(String title,String address,String text) {
		System.out.println(title);
		System.out.println(address);
		System.out.println(text);
	} 
	public static void email(String address,String text) {
		System.out.println("無題");
		System.out.println(address);
		System.out.println(text);
	} 
}
