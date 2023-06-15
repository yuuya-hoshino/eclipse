package tesu11;

public class Code5_3 {
	public static void methodA() {
		System.out.println("methodA");
		//methodBメソッドに移動
		methodC();
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//methodAメソッドに移動
		methodA();
	}
	public static void methodC() {
		System.out.println("methodC");
	}

}

