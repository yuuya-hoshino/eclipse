package myselfLogic;

public class Myself {
	public static String inputName() {
		String name = new java.util.Scanner(System.in).nextLine();
		return name;
	}
	public static void departmentPrint(String name) {
		System.out.println(name);
	}
}
