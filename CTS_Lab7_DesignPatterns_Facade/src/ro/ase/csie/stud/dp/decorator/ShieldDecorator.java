package ro.ase.csie.stud.dp.decorator;

import ro.ase.csie.stud.dp.adapter.ACMESuperHero;

public class ShieldDecorator extends AbstractDecorator {

	int shieldPoints;
	
	public ShieldDecorator(ACMESuperHero hero,int shieldPoints) {
		super(hero);
		this.shieldPoints=shieldPoints;
	}
	
	@Override
	public void takeAHit(int points) {
		int lostPoints=points-shieldPoints;
		if(lostPoints>0)
			super.takeAHit(lostPoints);
	}

}
