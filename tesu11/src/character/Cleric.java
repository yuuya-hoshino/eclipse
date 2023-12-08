package character;
import java.util.Random;

public class Cleric {
    public String name;//名前を管理変数
    int hp = 50;//HPを管理する変数
    final int maxhp = 50;//最大HP（固定）定数フィールド
    int mp = 10;//MP
    final int maxmp = 10;//最大MP（固定）定数フィールド
    int pc = 0;
    int[] pd=new int[255];
    
    //メソッド名：selfAid()
    //引数：なし
    //戻り値：なし
    //処理：HPの回復
    public void selfAid() {
        System.out.println(this.name+"はセルフエイドを唱えた！");
        this.mp = this.mp-5;
        this.hp = this.maxhp;
        System.out.println("HPが最大まで回復した");
        System.out.println("現在MP"+this.mp+"\n");
    }
    
    
    
    //メソッド名：pray()
    //引数：なし
    //戻り値：なし
    //処理：乱数を生成してMPの回復
    public void pray(int sec) {
        int r = new java.util.Random().nextInt(3);//乱数0～2
        int recovery = sec + r;//回復した分の計算
        this.mp+=recovery;
        //あふれた分の削除
        if(this.mp>= this.maxmp) {
            this.mp=this.mp-this.maxmp;
        }
        
        
        System.out.println(this.name+"は"+sec+"秒メッカにお祈りした!\n"+"MPが"+recovery+"回復");
        System.out.println("現在MP"+this.mp+"\n");
        this.pc++;
        pd[pc]+=recovery;
        
    }
    
    
    public void printMp() {
        
        System.out.println("【ゲームログ】");
        System.out.println(this.name+"の「お祈り」によって回復したMP");
        for(int i= 0; i<this.pc;i++) {
        
        System.out.println(i+1+"回目・・・"+this.pd[i+1]);
        }
    }
    
    
}