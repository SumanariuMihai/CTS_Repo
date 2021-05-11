package sumanariu.mihai.gr1094.SupplYear.Proxy;

import sumanariu.mihai.gr1094.SupplYear.Decorator.AbstractDecorator;
import sumanariu.mihai.gr1094.SupplYear.Factory.AbstractField;

public class FieldProxy extends AbstractDecorator {

	public FieldProxy(AbstractField field) {
		super(field);
	}
	
	@Override
	public String getSensibleData() {
		return this.SensibleData;
	}

}
