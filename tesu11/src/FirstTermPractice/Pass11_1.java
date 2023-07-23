package FirstTermPractice;
import java.util.Scanner;

public class Pass11_1 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String[] englishWords = {"dog", "cat", "mouse", "rabbit"};
	        String[] japaneseWords = {"いぬ", "ねこ", "ねずみ", "うさぎ"};

	        while (true) {
	            System.out.print("String>");
	            String input = scanner.nextLine();

	            if (input.isEmpty()) {
	                System.out.println("プログラムを終了します。");
	                break;
	            }

	            boolean foundTranslation = false;
	            for (int i = 0; i < englishWords.length; i++) {
	                if (englishWords[i].equals(input)) {
	                    System.out.println(japaneseWords[i]);
	                    foundTranslation = true;
	                    break;
	                }
	            }

	            if (!foundTranslation) {
	                System.out.println("?");
	            }
	        }
	    }

}
