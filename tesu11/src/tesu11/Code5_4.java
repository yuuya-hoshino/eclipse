package tesu11;

public class Code5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("メソッドを呼び出します");
		//helloメソッドに引数を渡す。
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.print("メソッドを呼び出が終わりました");
	}
	//メソッド名:hello
	//戻り値:なし
	//引数:name
	//処理:引数で受け取った文字を出力
	public static void hello(String name) {
	//(String name)で引数を代入している
		System.out.println(name+"さん、こんにちは");
	}
}
