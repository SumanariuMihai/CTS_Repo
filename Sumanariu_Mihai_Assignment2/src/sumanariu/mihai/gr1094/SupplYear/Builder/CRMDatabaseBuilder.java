package sumanariu.mihai.gr1094.SupplYear.Builder;

public class CRMDatabaseBuilder {

	private CRMDatabase database=null;
	
	public CRMDatabaseBuilder(String username) {
		database=new CRMDatabase();
		database.username=username;
	}
	
	public CRMDatabaseBuilder getLongText(String longText) {
		database.longText=longText;
		return this;
	}
	
	public CRMDatabaseBuilder getShortText(String shortText) {
		database.shortText=shortText;
		return this;
	}
	
	public CRMDatabaseBuilder getNumeral(int numeral) {
		database.numeral=numeral;
		return this;
	}
	
	public CRMDatabase build() {
		return this.database;
	}
}
