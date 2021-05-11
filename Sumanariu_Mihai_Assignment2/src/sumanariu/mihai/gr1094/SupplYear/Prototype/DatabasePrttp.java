package sumanariu.mihai.gr1094.SupplYear.Prototype;

import java.util.ArrayList;

public class DatabasePrttp {
	String username;
	ArrayList<FieldValue> database=new ArrayList<FieldValue>();
	
	public DatabasePrttp(String username) {
		this.username=username;
		}
	
	public void AddElement(FieldValue fieldValue) {
		try {
			database.add((FieldValue)fieldValue.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DatabasePrttp [username=");
		builder.append(username);
		builder.append(", database=");
		for(int i=0;i<database.size();i++)
			if(database.get(i).stringValue!=null)
				{
				builder.append(database.get(i).stringValue);
				builder.append(" ");
				}
			else
				{
				builder.append(database.get(i).numericalValue);
				builder.append(" ");
				}
		builder.append("]");
		return builder.toString();
	}
	
	
}
