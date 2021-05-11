package sumanariu.mihai.gr1094.SupplYear.Decorator;

import sumanariu.mihai.gr1094.SupplYear.Factory.AbstractField;

public class ActionsDecorator extends AbstractDecorator{

	public ActionsDecorator(AbstractField field) {
		super(field);
	}
	
	public void delete() {
		this.description=null;
		this.field=null;
	}
	
	public void setSensibleData(String data) {
		this.SensibleData=data;
	}
	
	@Override
	public String getSensibleData() {
		return this.SensibleData;
	}

	
}
