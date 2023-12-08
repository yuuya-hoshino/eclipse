package character;

public class HyperHero extends SuperHero {
	public void teleport() {
		System.out.println(this.name + "は瞬間移動した");
	}
	public void flyLandSit(int sec) {
		this.fly();
		this.land();
		this.sit(sec);
	}
	public void hide() {
		System.out.println(this.name+"は隠れた");
		run();
	}
	public void appear() {
		System.out.println(this.name+"は隠れて逃げた");
		silp();
	}
}
