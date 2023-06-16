package tesu11;

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
	}

}
