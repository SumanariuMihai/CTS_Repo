package sumanariu.mihai.gr1094.SupplYear.Prototype;

public class FieldValue {
	Integer numericalValue;
	String stringValue;
	
	public FieldValue() {
		this.numericalValue=null;
		this.stringValue=null;
	}
	
	public FieldValue(Integer number) {
		this.numericalValue=number;
		this.stringValue=null;
	}
	
	public FieldValue(String string) {
		this.stringValue=string;
		this.numericalValue=null;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		FieldValue copy=new FieldValue();
		if(this.numericalValue!=null)
			copy.numericalValue=this.numericalValue;
		if(this.stringValue!=null)
			copy.stringValue=this.stringValue;
		return copy;
	}
	
	
	
	
}
