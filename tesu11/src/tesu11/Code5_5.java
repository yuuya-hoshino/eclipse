package tesu11;

public class Code5_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		add(100,20);
		add(200,50);
	}
	//メソッド名:add(加算)
	//戻り値:なし
	//引数:int x , int y
	//処理:引数で貰ったx,yを加算した結果を
	//x+y=(合計)の形式で出力する
	public static void add(int x,int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}
