package FirstTermPractice;
import java.util.Scanner;

public class Pass8_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String>");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }


}
