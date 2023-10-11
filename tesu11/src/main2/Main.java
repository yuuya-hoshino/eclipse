package main2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		mysekfLogic.JobHunting.MessagePrint();
		String information[] = mysekfLogic.JobHunting.InputInformation();
		// InputクラスのStringInputメソッドを呼び出す
		System.out.println("入力情報の確認");
        System.out.println("氏名: " + information[0]);
        System.out.println("学校名: " + information[1]);
        System.out.println("希望職種: " + information[2]);
	}

}
