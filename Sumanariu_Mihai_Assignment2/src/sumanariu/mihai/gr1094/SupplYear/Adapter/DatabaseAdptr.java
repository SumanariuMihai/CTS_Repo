package sumanariu.mihai.gr1094.SupplYear.Adapter;

import java.util.ArrayList;

public abstract class DatabaseAdptr {

	public String description;
	
	public DatabaseAdptr(String description) {
		this.description=description;
	}
	
	public abstract String exportDescription();
	
	public abstract void importDescription(String description);
	
	public abstract void Add(String string);
}
