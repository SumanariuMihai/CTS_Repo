package ro.ase.csie.stud.dp.adapter;

public abstract class ACMESuperHero {

	String name;
	int lifePoints;
	int STR;
	int DEX;
	int INT;
	
	public ACMESuperHero(String name, int lifePoints, int sTR, int dEX, int iNT) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		STR = sTR;
		DEX = dEX;
		INT = iNT;
	}
	
	public abstract void move();
	public abstract void crouch();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
	
}
