package character;

public class Hero interface Version{
	
	public String name;//名前を管理する変数
	public int hp;//HPを管理する変数
	int level = 999;//レベル（固定）
	//コンストラクタ（引数：name,hp）
    public Hero(int hp,String name ) {
        this.hp = hp;//可変
        this.name = name;//可変
    }
    
    //コンストラクタ（引数：name）
    public Hero(String name) {
        this.hp = 100;//固定
        this.name = name;//可変
    }
    
    //コンストラクタ（引数：なし）
        public Hero() {
            //this.hp = 100;//固定
            //this.name = "ダミー";//固定
            //Stringを引数に持つコンストラクタを実行
            this("ダミー");
    }
	
	/*メソッド名:sleep()
	  引数:なし
	  戻り値:なし
	  処理:クラス変数hpに100を代入し出力*/
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	/*メソッド名:sit
	  引数:int型sec(秒数)
	  戻り値:なし
	  処理:クラス変数hpにsec秒分だけHPを回復する処理*/
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "、秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	/*メソッド名:silp
	  引数:なし
	  戻り値:なし
	  処理:HPを-5(固定)する*/
	public void silp() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5のダメージ");
	}
	/*メソッド名:run
	  引数:なし
	  戻り値:なし
	  処理:GAMEOVERで最終結果を表示する*/
	public void run() {
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPが" + this.hp + "ポイント回復した");
	}
	public void printVersion() {
		System.out.println("Heroクラスのバージョンは"+"ver1.3です。");
	}
}

