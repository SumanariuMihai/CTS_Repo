package ro.ase.csie.cts.g1094.singleton.staticref;

public class DbConnection {

	String connString;
	String schema;
	
	public static DbConnection connection= new DbConnection();
	
	//static class initializer
	static { 
		//called only once before the class is loaded by the JVM
		System.out.println("Hello! DbConnection is loaded!");
	}
	
	//constructor initializer
	{
		//call every time before any constructor call
		System.out.println("Building an object...");
	}
	
	private DbConnection() {
		System.out.println("Create empty object...");
	}

	private DbConnection(String connString, String schema) {
		super();
		System.out.println("Creating a configuration object");
		System.out.println("Loading configuration...");
		this.connString = connString;
		this.schema = schema;
	}
	
}
