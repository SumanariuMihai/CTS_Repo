package sumanariu.mihai.gr1094.SupplYear.Factory;

import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;

public class FieldFactory {
	public static AbstractField getField(FieldType type,String description) throws OperationNotSupportedException {
		AbstractField field=null;
		
		switch(type) {
		case NUMERICAL:
			field=new NumericalField(0,description);
			break;
		case TEXT:
			field=new TextField(description, " ");
			break;
		case OPTION:
			field=new OptionsField(description, new ArrayList<String>());
			break;
		default:
			throw new OperationNotSupportedException("Type not covered");
				
		}
		
		return field;
	}
}
