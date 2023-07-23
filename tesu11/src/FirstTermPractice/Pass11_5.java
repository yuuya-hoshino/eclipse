package FirstTermPractice;

public class Pass11_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] name = {"田中","前田","鈴木","中村","田辺","浦川","島田","岩田"};
		int[] drinking = {7,0,3,3,2,0,0,6};
		int[] smoking= {60,10,0,20,10,0,30,0};
		
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"("+drinking[i]+","+smoking[i]+")");
			if(drinking[i]==0 && smoking[i]==0) {
				System.out.print("\t安全");
			}
			else if(drinking[i]==0 && smoking[i]>= 1 && smoking[i] <= 12 || drinking[i]>= 1 && drinking[i] <= 3 && smoking[i]==0) {
				System.out.print("\t注意");
			}
			else if(drinking[i]>=1 && drinking[i]<=3 && smoking[i]>= 1 && smoking[i] <= 20) {
				System.out.print("\t要注意");
			}
			else if(drinking[i]>=4 || smoking[i] >= 21) {
				System.out.print("\t要検査");
			}
			System.out.println();
		}
	}

}
