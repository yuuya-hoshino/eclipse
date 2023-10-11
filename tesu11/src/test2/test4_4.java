package test2;

public class test4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numgers = {3,4,9};
		System.out.println("1行入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int i:numgers) {
			if(i == input) {
				System.out.println("アタリ");
			}
		}
	}

}
