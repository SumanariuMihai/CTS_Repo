package ro.acs.csie.cts.g1094.dp.builder;

public class SuperHero {

	String name;
	Integer lifePoints;
	boolean isVillain;
	boolean isWounded;
	
	//String leftWeapon; - don't do this, weapon might become an object
	WeaponInterface leftWeapon;
	WeaponInterface rightWeapon;
	
	String superPower;
	String superSuperPower;
	
	public SuperHero() {
		
	}

	public SuperHero(String name, Integer lifePoints, boolean isVillain, boolean isWounded, WeaponInterface leftWeapon,
			WeaponInterface rightWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.leftWeapon = leftWeapon;
		this.rightWeapon = rightWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	public void takesAHit(int points) {
		this.lifePoints-=points;
		this.isWounded=true;
	}
	
	public void heal(int points) {
		this.lifePoints+=points;
		if(this.lifePoints>=100) {
			this.lifePoints=100;
			this.isWounded=false;
		}
	}
	
	public static class SuperHeroBuilder {
		
		private SuperHero superhero=null;
		
		public SuperHeroBuilder(String name, int lifePoints){
		superhero=new SuperHero();
		superhero.lifePoints=lifePoints;
		}
		
		public SuperHeroBuilder isVillain() {
			superhero.isVillain=true;
			return this;
		}
		
		public SuperHeroBuilder isWounded() {
			superhero.isWounded=true;
			return this;
		}
		
		public SuperHeroBuilder addLeftWeapon(WeaponInterface leftWeapon) {
			superhero.leftWeapon=leftWeapon;
			return this;
		}
		
		public SuperHeroBuilder addRightWeapon(WeaponInterface rightWeapon) {
			superhero.rightWeapon=rightWeapon;
			return this;
		}
		
		public SuperHeroBuilder addSuperPower(String superPower) {
			superhero.superPower=superPower;
			return this;
		}
		
		public SuperHeroBuilder addSuperSuperPower(String superSuperPower) {
			superhero.superSuperPower=superSuperPower;
			return this;
		}
		
		//DON'T FORGET TO PROVIDE THIS
		public SuperHero build() {
			return this.superhero;
		}
		
	}
	
	
}
