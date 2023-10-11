package mysekfLogic;


public class JobHunting {

	public static void MessagePrint() {
        System.out.println("こんにちは！以下の内容を入力してください。");
    }
	public static String[] InputInformation() {
		String[] InputInformation = new String[3]; // 要素数3の配列を宣言

        // 氏名を入力して情報配列に格納
		System.out.print("氏名を入力:");
		InputInformation[0] = Input.StringInput();

        // 学校名を入力して情報配列に格納
		System.out.print("学校を入力:");
		InputInformation[1] = Input.StringInput();

        // 希望職種を入力して情報配列に格納
		System.out.print("希望職種を入力:");
		InputInformation[2] = Input.StringInput();

        return InputInformation;
    }

}






