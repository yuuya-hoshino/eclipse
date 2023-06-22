package tesu11;

public class Code5_14 {
	//メソッド名:makeArray
	//戻り値:なし
	//引数:newArray[int型配列]
	//処理:引数の数字の数だけ配列の要素を作成して、
	//0~連番の値をそれぞれ格納し配列の「リンク」を返す。
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for(int i = 0; i< newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = makeArray(3);
		for(int i:array) {
			System.out.println(i);
		}
	}

}
