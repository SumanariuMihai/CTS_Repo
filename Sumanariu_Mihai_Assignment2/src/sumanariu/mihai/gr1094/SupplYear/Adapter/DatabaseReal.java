package sumanariu.mihai.gr1094.SupplYear.Adapter;

import java.util.ArrayList;

public class DatabaseReal extends DatabaseAdptr{

	ArrayList<String> values=new ArrayList<String>();

	public DatabaseReal(String description,ArrayList<String> values) {
		super(description);
		this.values=values;
	}

	

	@Override
	public String exportDescription() {
		return description;
	}

	@Override
	public void importDescription(String description) {
		this.description=description;
		
	}



	@Override
	public void Add(String string) {
		values.add(string);
		
	}
}
