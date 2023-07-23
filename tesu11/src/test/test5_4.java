package test;

public class test5_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double Area = calcTriangleArea(10.0,5.0);
		System.out.println(Area);
		double en = ensyu(5.0);
		System.out.println(en);
	}
	public static double calcTriangleArea(double dottom,double height) {
		double area = (dottom*height)/2;
		return area;
	}
	public static double ensyu(double radius) {
		double area = radius*radius*3.14;
		return area;
	}
}
