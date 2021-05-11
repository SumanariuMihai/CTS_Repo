package sumanariu.mihai.gr1094.SupplYear.Adapter;

public class MarketingToNormalDatabase extends DatabaseAdptr{

	MarketingActions mkDb=null;
	
	public MarketingToNormalDatabase(MarketingActions mktDb) {
		super(mktDb.getDescription());
		mkDb=mktDb;
	}

	@Override
	public String exportDescription() {
		return this.mkDb.getDescription();
	}
	
	@Override
	public void importDescription(String description) {
		this.mkDb.setDescription(description);
	}

	@Override
	public void Add(String string) {
		try{mkDb.Add(Integer.parseInt(string));
		}catch(NumberFormatException e) {
			System.out.println("You did not input a number!");
		}
	}
}
