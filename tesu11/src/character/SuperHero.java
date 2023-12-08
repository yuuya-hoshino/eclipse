package character;

public class SuperHero extends Hero{
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.name+"撤退した!");
	}
	public void hide() {
		System.out.println(this.name+"は隠れた");
	}
	public void appear() {
		System.out.println(this.name+"は隠れて逃げた");
		run();
	}
}
