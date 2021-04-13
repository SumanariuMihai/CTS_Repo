package ro.ase.csie.stud.dp.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FantasyHero blueDragon=new FantasyHero
				("Blue Dragon",1000, 20, 10, 15, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);
	}

}
