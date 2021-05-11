package sumanariu.mihai.gr1094.SupplYear.Singleton;

public class DatabaseConnection {

	String connIP;
	String username;
	
	public static DatabaseConnection connection=new DatabaseConnection();
	
	{
		System.out.println("Loading database...");
	}
	
	private DatabaseConnection() {
		System.out.println("Logging to default account...");
		this.connIP = "127.0.0.1:1443";
		this.username="JohnDoe1998";
	}
	
	private DatabaseConnection(String connection, String username) {
		System.out.println("Logging in...");
		this.connIP=connection;
		this.username=username;
	}
	
	
}
