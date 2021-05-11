package sumanariu.mihai.gr1094.SupplYear;

import sumanariu.mihai.gr1094.SupplYear.Singleton.*;

import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;

import sumanariu.mihai.gr1094.SupplYear.Adapter.*;
import sumanariu.mihai.gr1094.SupplYear.Builder.*;
import sumanariu.mihai.gr1094.SupplYear.Decorator.*;
import sumanariu.mihai.gr1094.SupplYear.Factory.*;
import sumanariu.mihai.gr1094.SupplYear.Prototype.*;
import sumanariu.mihai.gr1094.SupplYear.Proxy.*;

public class TestAssignment {

	public static void main(String[] args) {

		//Singleton
		DatabaseSmpltn con1=DatabaseSmpltn.connection;
		DatabaseSmpltn con2=DatabaseSmpltn.connection;
		
		System.out.println("Singleton Test: ");
		if(con1==con2)
			System.out.println("Conn1 and Conn2 are the same connection");
		else
			System.out.println("The connections are different");
		
		
		//Builder
		System.out.println(" ");
		System.out.println("Builder Test: ");
		CRMDatabase databaseBuilt=new CRMDatabaseBuilder("EusebiuGinescu68")
									.getShortText("Name: ")
									.getLongText("Personal Story: ")
									.getNumeral(68)
									.build();
		System.out.println(databaseBuilt.toString());
		
		
		//Prototype
		System.out.println(" ");
		System.out.println("Prototype Test: ");
		FieldValue field1=new FieldValue("Eusebiu");
		FieldValue field2=new FieldValue(68);
		DatabasePrttp databasePrototypeUsed=new DatabasePrttp("EusebiuGinescu68");
		databasePrototypeUsed.AddElement(field1);
		databasePrototypeUsed.AddElement(field2);//Creates copies
		field1=null;
		field2=null;
		System.out.println(databasePrototypeUsed.toString());
		
		//Factory
		System.out.println("   ");
		System.out.println("Factory Test: ");
		DatabaseFctr databaseFactoryUsed=new DatabaseFctr("EusebiuGinescu68");
		try {
			databaseFactoryUsed.AddField(FieldFactory.getField(FieldType.TEXT, "Name: "));
			databaseFactoryUsed.AddField(FieldFactory.getField(FieldType.NUMERICAL, "Age: "));
			databaseFactoryUsed.AddField(FieldFactory.getField(FieldType.OPTION, "Proffesion: "));
			System.out.println("Factory Succeded!");
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
			System.out.println("Factory Failed!");
		}
		
		//Decorator 
		System.out.println("   ");
		System.out.println("Decorator implemented!");
		ActionsDecorator field3=new ActionsDecorator(databaseFactoryUsed.get(1));
		field3.setSensibleData("Bank PIN:1953");
		databaseFactoryUsed.AddField(field3); 
		
		
		//Proxy (Combined with Decorator)
		System.out.println(" ");
		System.out.println("Proxy test: ");
		FieldProxy fieldProxy=new FieldProxy(field3);
		System.out.println("Sensible Data from free class: "+field3.getSensibleData());
		System.out.println("Sensible Data from proxy: "+fieldProxy.getSensibleData());
		System.out.println("Can't set sensible data");
		
		//Adapter
		System.out.println("  ");
		System.out.println("Adapter Implemented!");
		DatabaseAdptr database3=new DatabaseReal("New Database!", new ArrayList<String>());
		database3.Add("Eusebiu");
		database3.importDescription("Eusebiu's Database!");
		
		MarketingActions database4=new MarketingDatabase("Marketing Database", new ArrayList<Integer>());
		database4.Add(10534);
		database4.Add(54);
		database4.computeAverage(database4.sumUp());
		
		
		
		
		
	}

}
