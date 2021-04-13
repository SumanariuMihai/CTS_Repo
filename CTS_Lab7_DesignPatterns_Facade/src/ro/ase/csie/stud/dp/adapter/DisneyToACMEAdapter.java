package ro.ase.csie.stud.dp.adapter;

import ro.ase.csie.stud.dp.adapter.disney.DisneyActions;

public class DisneyToACMEAdapter extends ACMESuperHero {
	
	DisneyActions disneyHero=null;

	public DisneyToACMEAdapter(DisneyActions disneyHero) {
		super(disneyHero.getName(),disneyHero.getPower(),25,10,5);
		this.disneyHero = disneyHero;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.disneyHero.changeLocation(0, 0);
	}

	@Override
	public void crouch() {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s is moving slowly", this.disneyHero.getName()));
	}

	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		this.disneyHero.isWounded(points);
	}

	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		this.disneyHero.restorePower(points);
	}
	
	
}
