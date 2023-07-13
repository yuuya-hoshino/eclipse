package tesu11;

public class test {

	public static void main(String[] args) {
        //配列を作成
        String[] Score = {"X", "XX", "XXX", "XXXX", "XXXXX"};
        //変更前の処理
        System.out.println("変更前");
        //配列の中身を表示
        arrayoutput(Score);
        //変更後の処理
        System.out.println("変更後");
        String GetScoreName  = getScoreName(Score.length);
        arrayoutput(Score,GetScoreName);
    }
    //メソッド名:addscorename
    //戻り値:String[] scorename
    //引数:String[] score
    //処理:switchで入れた数値を返す
    public static String getScoreName(int length) {
        switch (length) {
            case 1:
                return "ストライク";
            case 2:
                return "ダブル";
            case 3:
                return "ターキー";
            case 4:
                return "ハムボーン";
            case 5:
                return "ヤッツィー";
            default:
                return "";
        }
    }
    public static void arrayoutput(String[] Score) {
    	for (String score : Score) {
            System.out.println(score);
        }
    }
    public static void arrayoutput(String[] Score,String GetScoreName) {
    	for (String score : Score) {
    		System.out.println(score + ":" + getScoreName(score.length()));
        }
    }

}
