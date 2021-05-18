package ro.acs.csie.cts.dp.observer;

public class UINotificationsModule implements NetworkStatusHandlerInterface {

	@Override
	public void connectionDown() {
		System.out.println("Alert: Connection Lost!");
	}

	@Override
	public void connectionUp() {
		System.out.println("Alert: Let's get back to the game!");
	}

}
