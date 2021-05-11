package sumanariu.mihai.gr1094.SupplYear.Singleton;

import java.util.ArrayList;

public class DatabaseSmpltn {
	String parameters;
	
	ArrayList<String> usernamesList=new ArrayList<String>();
	
	public static DatabaseSmpltn connection=new DatabaseSmpltn();
	
	public DatabaseSmpltn() {
		parameters=" ";
		usernamesList.add("VioricaVasilica");
		usernamesList.add("DanutBanut");
		usernamesList.add("NicuDanisor");
		usernamesList.add("TalucaRurcan");
		//This code does not differentiate based on any political views. It is just a joke for test purposes
	}
	
	public boolean isInList(String username) {
		if(this.usernamesList.contains(username))
		{
			System.out.println("Connected!");
			return true;
		}
		else
		{
			System.out.println("Failed to connect! Username is not in database!");
			return false;
		}
	}
}
