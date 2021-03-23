package ro.ase.csie.cts.g1094.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		DbConnection con1=DbConnection.getDbConnection("127.0.0.1:3306","devDb");
		DbConnection con2=DbConnection.getDbConnection("127.0.0.1:3306","devDb");
		if(con1==con2)
			System.out.println("They are the same");
		
		
		DbConnection con3=DbConnection.getDbConnection("127.0.0.1:3306","prodDb");
		
		if(con1!=con3)
			System.out.println("They are different");
	}

}
