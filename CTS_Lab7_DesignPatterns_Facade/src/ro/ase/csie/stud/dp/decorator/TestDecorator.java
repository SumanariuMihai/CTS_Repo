package ro.ase.csie.stud.dp.decorator;

import ro.ase.csie.stud.dp.adapter.ACMESuperHero;
import ro.ase.csie.stud.dp.adapter.FantasyHero;

public class TestDecorator {

	public static void main(String[] args) {
		
		ACMESuperHero blueDragon=new FantasyHero
				("Blue Dragon",1000, 20, 10, 15, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);
			
		ACMESuperHero blueDragonWithShield=new ShieldDecorator(blueDragon, 500);
		blueDragonWithShield.takeAHit(500);
		
		blueDragon=new WoundedDecorator(blueDragon);
		blueDragon.takeAHit(1000);
		blueDragon.takeAHit(1000);
		blueDragon.move();
			
	}
}
