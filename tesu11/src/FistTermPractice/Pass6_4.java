package FistTermPractice;
import java.util.Scanner;

public class Pass6_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println("最大値: " + max);
	}

}
