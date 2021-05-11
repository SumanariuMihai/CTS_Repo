package sumanariu.mihai.gr1094.SupplYear.Factory;

import java.util.ArrayList;

public class DatabaseFctr {

	String username;
	ArrayList<AbstractField> variables=new ArrayList<AbstractField>();
	
		
	public DatabaseFctr(String username) {
		this.username=username;
	}
	
	public void AddField(AbstractField field) {
		variables.add(field);
	}
	
	public AbstractField get(int i) {
		return this.variables.get(i);
	}
}
