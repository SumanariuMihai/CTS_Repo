package ro.ase.csie.cts.g1094.dp.test;

import ro.acs.csie.cts.g1094.dp.builder.Pistol;
import ro.acs.csie.cts.g1094.dp.builder.SuperHero;
import ro.acs.csie.cts.g1094.dp.builder.SuperHero.SuperHeroBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		/* First option
		 * //1. Create the object
		SuperHero superHero = new SuperHero();
		//2. Init the object
		//TODO: Don't forget to initiate
		superHero.name="Superman";
		superHero.lifePoints=100;
		superHero.superPower="Can Fly";
		superHero.superPower="Laser Eyes";
		*/
		
		/*
		//Second option - messy, what do the variables mean?
		SuperHero superHero=new SuperHero("Superman",100,false,false,null,
				new Pistol(),"Laser eyes","");
		*/
		
		SuperHero superman=new SuperHero.SuperHeroBuilder("Superman", 100)
				.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
		
		SuperHero joker=new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
		
		
		
	}

}
