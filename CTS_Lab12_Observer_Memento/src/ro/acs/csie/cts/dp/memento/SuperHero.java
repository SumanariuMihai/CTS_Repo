package ro.acs.csie.cts.dp.memento;

public class SuperHero {

	String name;
	int lifePoints;
	String magic;
	
	SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("Is attacking...");
	}
	
	public void heal() {
		System.out.println("Is healing...");
	}
	
	public void move() {
		System.out.println("Is moving...");
	}
	
	public SuperHeroMemento save() {
		return new SuperHeroMemento(name, lifePoints, magic);
	}
	
	public void load(SuperHeroMemento autosave) {
		this.name=autosave.name;
		this.magic=autosave.magic;
		this.lifePoints=autosave.getLifePoints();
	}
}
