package ro.ase.csie.stud.dp.adapter.disney;

public class DonaldDuck implements DisneyActions{

	public final String name="Donald Duck";
	int powerLevel;
	
	public DonaldDuck(int powerLevel) {
		super();
		this.powerLevel = powerLevel;
	}

	@Override
	public void changeLocation(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Move to a new location");
		
	}

	@Override
	public void isWounded(int power) {
		// TODO Auto-generated method stub
		powerLevel-=power;
		System.out.println("Power decreased to "+powerLevel);
	}

	@Override
	public void restorePower(int power) {
		// TODO Auto-generated method stub
		powerLevel+=power;
		System.out.println("Power increased to "+powerLevel);
	}
	
}
