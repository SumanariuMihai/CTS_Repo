package ro.ase.csie.cts.g1094.singleton;

public class DbConnection {

	String connString;
	String schema;
	
	private static DbConnection connection=null;
	
	private DbConnection() {
		System.out.println("create");
	}

	private DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
	//it's not clean
	//it's misleading - others will think they have multiple connections
	public static DbConnection getConnection(String connString, String schema) {
		if(DbConnection.connection==null) {
			connection= new DbConnection(connString,schema);
		}
		return DbConnection.connection;
	}
	
	
}
