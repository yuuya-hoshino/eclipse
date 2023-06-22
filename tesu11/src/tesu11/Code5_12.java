package tesu11;

public class Code5_12 {
	//メソッド名:printArray
	//戻り値:なし
	//引数:array(int型)
	//処理:引数で貰った配列arrayを表示させる
	public static void printArray(int [] array) {
		for(int element:array) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] array = {1,2,3};
		printArray(array);
	}

}
