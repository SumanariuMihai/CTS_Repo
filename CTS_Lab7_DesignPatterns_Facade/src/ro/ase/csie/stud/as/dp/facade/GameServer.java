package ro.ase.csie.stud.as.dp.facade;

public class GameServer {
	public void connect(String serverIP) {
		System.out.println("Connecting to "+serverIP);
	}
	
	public boolean isConnected() {
		return true;
	}
}
