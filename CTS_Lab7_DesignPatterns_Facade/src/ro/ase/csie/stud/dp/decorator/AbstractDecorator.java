package ro.ase.csie.stud.dp.decorator;

import ro.ase.csie.stud.dp.adapter.ACMESuperHero;

public abstract class AbstractDecorator extends ACMESuperHero{

	ACMESuperHero hero=null;

	public AbstractDecorator(ACMESuperHero hero) {
		super(hero.name, hero.lifePoints, 0, 0, 0);
		this.hero = hero;
	}

	@Override
	public void move() {
		this.hero.move();
	}

	@Override
	public void crouch() {
		this.hero.crouch();
	}

	@Override
	public void takeAHit(int points) {
		this.hero.takeAHit(points);
	}

	@Override
	public void heal(int points) {
		this.hero.heal(points);
	}
	
	
	
}
