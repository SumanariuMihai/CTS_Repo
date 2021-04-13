package ro.ase.csie.stud.as.dp.facade;

public class UserAPIFacade {
	
	public static UserProfile getUserProfile(String serverIP,String userName,String password) {
		GameServer gameServer=new GameServer();
		gameServer.connect("10.0.0.1");
		if(gameServer.isConnected()) {
			UserAccount user=new UserAccount();
			user.login(userName,password);
		
			UserProfile profile=user.downloadUserProfile();
			profile.getUserProfile();
		return profile;
		}
		else 
			return null;
	}
	
}
