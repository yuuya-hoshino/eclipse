package character;

public class Preast extends Cleric {
	 public void selfAid() {//オーバーライドは上書き
        System.out.println(this.name+"はセルフエイドを唱えた！");
        this.mp = this.mp-3;
        this.hp = this.maxhp;
        System.out.println("HPが最大まで回復した");
        System.out.println("現在MP"+this.mp+"\n");
    }
	 public void pray(int sec,Matango mt) {
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
	        //攻撃
	        mt.hp -= recovery;
	        
	        
	 }
}
