package sumanariu.mihai.gr1094.SupplYear.Factory;

public class NumericalField extends AbstractField {
	
	protected int value;
	
	public NumericalField(int value, String description) {
		this.value=value;
		this.description=description;
	}
}
