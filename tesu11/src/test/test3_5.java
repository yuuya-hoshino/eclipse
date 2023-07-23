package test;
import java.util.Scanner;

public class test3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1:検索 2:登録 3:削除 4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
			case 1:
				System.out.println("検索");
				break;
			case 2:
				System.out.println("登録");
				break;
			case 3:
				System.out.println("削除");
				break;
			case 4:
				System.out.println("変更");
				break;
		}
	}

}
