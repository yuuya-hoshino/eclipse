package FistTermPractice;
import java.util.Scanner;

public class Pass6_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner scanner = new Scanner(System.in);

        // 文字列の入力
        System.out.print("文字列を入力してください:");
        String str1 = scanner.nextLine();

        // 条件を満たすか確認
        boolean isLengthValid = str1.length() >= 10;
        boolean hasLowerCase = str1.matches(".*[a-z].*");
        boolean hasMultiple5s = str1.matches(".*5.*5.*|.*5.*\\d.*5.*|.*\\d.*5.*5.*");

        if (isLengthValid && hasLowerCase && hasMultiple5s) {
            // 文字列の長さを表示
            System.out.println("文字列の長さ: " + str1.length());

            // 先頭から5文字目を表示
            System.out.println("先頭から5文字目: " + str1.substring(0,5));

            // 先頭から7文字目を表示
            System.out.println("先頭から7文字目: " + str1.charAt(6));

            // 文字列の中の5を0に置換した文字列を作成
            String str2 = str1.replace('5', '0');
            System.out.println("置換後の文字列: " + str2);

            // 文字列の中の小文字を大文字に変換した文字列を作成
            String str3 = str2.toUpperCase();
            System.out.println("大文字に変換後の文字列: " + str3);
        } else {
            System.out.println("条件に合致する文字列が入力されませんでした。");
        }
	}

}
