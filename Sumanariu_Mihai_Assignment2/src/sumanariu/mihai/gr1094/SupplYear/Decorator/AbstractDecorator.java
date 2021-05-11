package sumanariu.mihai.gr1094.SupplYear.Decorator;
import sumanariu.mihai.gr1094.SupplYear.Factory.*;

public abstract class AbstractDecorator extends AbstractField {

	AbstractField field=null;
	protected String SensibleData="*******";
	
	public AbstractDecorator(AbstractField field) {
		this.field=field;
	}
	
	@Override
	public void setDescription(String description) {
		this.description=description;
	}
	
	public String getSensibleData() {
		return this.SensibleData;
	}
	
}
