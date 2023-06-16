package tesu11;
import java.util.Scanner;

public class Code5_7 {
	//メソッド名:add
	//戻り値:ans
	//引数:int x , int y
	//処理:引数で貰ったx,yを合計した結果を返す
	public static int add(int x , int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int ans = add(100,10);
		System.out.println("100 + 10 =" + ans);
		System.out.println(add(add(10,20),add(30,40)));
							//add(30,70)
							//add(100)
		//stringScannerの処理
		String appendedString = stringScanner("さん");
		System.out.println(appendedString);
		
		//intScannerの処理
		int sum = intScanner(1000);
        System.out.println(sum);
        
		//doubleScannerの処理
		double total = doubleScanner(15.5);
        System.out.println(total);
	}
	//ミニ問題
	//以下の使用のメソッドを作成して
	//mainメソッドから呼び出してください
	
	//メソッド名:stringScanner
	//引数:string型
	//戻り値:String型
	//処理内容:ユーザーから文字列をキーボードで入力させて、
	//　　　　　　　その文字と引数の文字列を結合して値を戻す
	//　　　　　　　例:引数=>"さん",キーボード入力=>"土屋"==>結果"土屋さん"
	public static String stringScanner(String arg) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("文字列を入力してください: ");
        String input = scanner.nextLine();
        
        return input + arg;
	}
	//メソッド名:intScanner
	//戻り値:int型
	//引数:int型
	//処理内容:ユーザーから数字をキーボードで入力させて、
	//　　　　　　　その数字と引数の数字を合計した値を戻す
	//　　　　　　　例:引数=>1000,キーボード入力=>3000==>結果 4000
	public static int intScanner(int arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("数字を入力してください: ");
        int input = scanner.nextInt();
        
        return input + arg;
    }
	//メソッド名:doubleScanner
	//戻り値:double型
	//引数:double型
	//処理内容:ユーザーから小数をキーボードで入力させて、
	//　　　　　　　その小数と引数の小数を合計した値を戻す
	//　　　　　　　例:引数=>15.5,キーボード入力=>32.3==>結果 4.78
	 public static double doubleScanner(double arg) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("小数を入力してください: ");
	    double input = scanner.nextDouble();
	    
	    return input + arg;
	 }
}
