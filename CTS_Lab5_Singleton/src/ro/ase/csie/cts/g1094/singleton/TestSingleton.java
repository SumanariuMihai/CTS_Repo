package ro.ase.csie.cts.g1094.singleton;

public class TestSingleton {

	public static void main(String[] args) {
//		SINGLETON DOESN'T ALLOW CREATING MULTIPLE OBJECTS
//		NOT WORKING BECAUSE CONSTRUCTORS ARE PRIVATE
//		DbConnection con1= new DbConnection();
//		DbConnection con2= new DbConnection();

//		DbConnection con1= new DbConnection("127.0.0.1:3306","cts");
//		DbConnection con2= new DbConnection("127.0.0.1:3306","cts");
		
		DbConnection con1=DbConnection.getConnection("127.0.0.1:3306","cts");
		DbConnection con2=DbConnection.getConnection("127.0.0.1:3306","cts");
		if(con1==con2)
			System.out.println("They are the same");
		
	}

}
