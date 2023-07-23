package FirstTermPractice;
import java.util.Scanner;

public class Pass11_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("int>");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("プログラムを終了します。");
                break;
            }

            String season = getSeason(input);
            System.out.println(season);
        }
    }

    private static String getSeason(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "冬";
            case 3:
            case 4:
            case 5:
                return "春";
            case 6:
            case 7:
            case 8:
                return "夏";
            case 9:
            case 10:
            case 11:
                return "秋";
            default:
                return "?";
        }
    }

}
