package FistTermPractice;
import java.util.Random;

public class Pass6_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 乱数を生成して変数aに代入
        Random random = new Random();
        double a = random.nextDouble();

        // 6a + 1を計算して変数pに代入（キャストしてint型にする）
        int p = (int)(6 *a) + 1;

        // 結果を表示
        System.out.println("サイコロの目数="  + p);
	}

}
