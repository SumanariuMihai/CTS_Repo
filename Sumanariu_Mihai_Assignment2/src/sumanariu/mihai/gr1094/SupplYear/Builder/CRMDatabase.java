package sumanariu.mihai.gr1094.SupplYear.Builder;

public class CRMDatabase {
	String username;
	String longText;
	String shortText;
	int numeral;
	//this is a simulation, in reality, the Database would have more variables
	
	public CRMDatabase() {
		this.username=null;
		this.longText=null;
		this.shortText=null;
		this.numeral=0;
	}
	
	public CRMDatabase(String longText,String shortText, int numeral,String username) {
		this.username=username;
		this.longText=longText;
		this.shortText=shortText;
		this.numeral=numeral;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CRMDatabase [username=");
		builder.append(username);
		builder.append(", longText=");
		builder.append(longText);
		builder.append(", shortText=");
		builder.append(shortText);
		builder.append(", numeral=");
		builder.append(numeral);
		builder.append("]");
		return builder.toString();
	}
	
	
}
