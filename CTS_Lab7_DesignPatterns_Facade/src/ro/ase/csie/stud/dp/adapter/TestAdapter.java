package ro.ase.csie.stud.dp.adapter;

import java.util.ArrayList;

import ro.ase.csie.stud.dp.adapter.disney.DisneyActions;
import ro.ase.csie.stud.dp.adapter.disney.DonaldDuck;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ACMESuperHero blueDragon=new FantasyHero
				("Blue Dragon",1000, 20, 10, 15, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);
	

	DisneyActions donald=new DonaldDuck(100);
	donald.changeLocation(100,150);
	donald.isWounded(50);
	donald.restorePower(25);
	
	ArrayList<ACMESuperHero> heroes=new ArrayList<>();
	heroes.add(blueDragon);
	DisneyToACMEAdapter donaldAdapter=new DisneyToACMEAdapter(donald);
	heroes.add(donaldAdapter);
	
	System.out.println("----------------");
	for(ACMESuperHero hero: heroes) {
		hero.move();
		hero.takeAHit(50);
		hero.heal(40);
	}
	}
}
