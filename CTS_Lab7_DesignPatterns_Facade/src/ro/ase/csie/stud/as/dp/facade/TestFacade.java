package ro.ase.csie.stud.as.dp.facade;

public class TestFacade {
	
	public static void main(String[] args) {
		//before Facade
		GameServer gameServer=new GameServer();
		gameServer.connect("10.0.0.1");
		UserAccount user=new UserAccount();
		user.login("SaberSlashS","doarNuImiPunParolaInCevaDePeGit");
		
		UserProfile profile=user.downloadUserProfile();
		profile.getUserProfile();
		
		//after Facade
		UserProfile player1Profile=UserAPIFacade.getUserProfile("10.0.0.1", 
				"SaberSlashS","doarNuImiPunParolaInCevaDePeGit");
		if(player1Profile!=null)
			player1Profile.getUserProfile();
	}
}
