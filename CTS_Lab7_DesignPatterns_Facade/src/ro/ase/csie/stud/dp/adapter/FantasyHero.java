package ro.ase.csie.stud.dp.adapter;

public class FantasyHero extends ACMESuperHero{

	boolean canFly;
	
	public FantasyHero(String name,int lifePoints,int STR,int DEX,int INT, boolean canFly) {
		super(name,lifePoints,STR,DEX,INT);
		this.canFly=canFly;
	}
	
	public void move() {
		if(this.canFly)
			System.out.println("Is Flying");
		else
			System.out.println("Is running");
	}
	
	public void crouch() {
		if(this.canFly)
			System.out.println("Is descending to earth and crouching");
		else
			System.out.println("Is crouching");
	}
	
	public void takeAHit(int points) {
		points=points-this.STR;
		System.out.println(
				String.format("%s takes a hit of %d points",name,points));
		this.lifePoints-=points;
	}
	
	public void heal(int points) {
		points=points+this.INT;
		System.out.println(
				String.format("%s heals for %d points", name, points));
		this.lifePoints+=points;
	}
}
