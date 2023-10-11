package main;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("名前を入力");
		String name = myselfLogic.Myself.inputName();
		myselfLogic.Myself.departmentPrint(name);
		schoolPrint.School.nkcschoolPrint();
		schoolPrint.School.departmentPrint("あああああ");
		myselfLogic.Divination.fortune();
	}

}
