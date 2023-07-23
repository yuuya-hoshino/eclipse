package FirstTermPractice;
import java.util.Arrays;

public class Pass13_2_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double[] kion= {20.5,23.4,26.1,28.5,33.5,29.1};
		
		// 配列を昇順にソートする
        Arrays.sort(kion);

        // ソート後の配列を表示する
        for (double temperature : kion) {
            System.out.print(temperature+"\t");
        }
		
	}

}
