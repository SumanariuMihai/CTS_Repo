package sumanariu.mihai.gr1094.SupplYear.Factory;

import java.util.ArrayList;

public class OptionsField extends AbstractField{

	ArrayList<String> options;
	int choice;
	
	public OptionsField(String description,ArrayList<String> options) {
		this.options=options;
		this.description=description;
	}
	
	public void changeOption(int choice) {
		this.choice=choice;
	}
	
	public void changeOption(String choiceName) {
		if(options.indexOf(choiceName)!= -1)
			this.choice=options.indexOf(choiceName);
	}
	
}
