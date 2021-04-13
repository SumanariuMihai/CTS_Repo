package ro.ase.csie.stud.dp.decorator;

import ro.ase.csie.stud.dp.adapter.ACMESuperHero;

public class WoundedDecorator extends AbstractDecorator {

	public WoundedDecorator(ACMESuperHero hero) {
		super(hero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		if(this.hero.lifePoints>500)
			this.hero.move();
		else
			System.out.println("The hero is barely moving");
	}
	
	
}
