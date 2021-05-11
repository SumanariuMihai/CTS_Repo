package sumanariu.mihai.gr1094.SupplYear.Adapter;

import java.util.ArrayList;

public class MarketingDatabase implements MarketingActions {

	String description;
	ArrayList<Integer> numericalValues=new ArrayList<Integer>();
	
	public MarketingDatabase(String description, ArrayList<Integer> numbers) {
		this.description=description;
		this.numericalValues=numbers;
	}
	
	public int sumUp() {
		int sum=0;
		for(int i=0;i<numericalValues.size();i++)
			sum+=numericalValues.get(i);
		return sum;
	}
	
	@Override
	public int computeAverage(int sum) {
		// TODO Auto-generated method stub
		return sum/numericalValues.size();
	}

	@Override
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}

	@Override
	public void Add(int newElem) {
		numericalValues.add(newElem);
		
	}

}
