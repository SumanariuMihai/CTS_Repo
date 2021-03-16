package ro.ase.acs.cts.laborator3.phase3;

import ro.ase.acs.cts.laborator3.phase3.services.MarketingServiceInterface;
import ro.ase.acs.cts.laborator3.phase3.services.ValidatorServiceInterface;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidPriceException;

public class Product {
	
	MarketingServiceInterface mkService=null;
	ValidatorServiceInterface validator=null;
	
	public Product(MarketingServiceInterface mkService,
					ValidatorServiceInterface validator) {
		/*if(mkService==null)
			throw new NullPointerException();*/
		this.mkService=mkService;
		this.validator=validator;
	}
	
	//optional - based on design specs
	public void setMarketingService(MarketingServiceInterface mkService)
	{
		if(mkService==null)
			throw new NullPointerException();
		this.mkService=mkService;
	}
	
	
	private static float getDiscountValue(float price, float discount) {
		return discount * price;
	}
	
	private static float getPriceWithDiscountAndFidelity(float price,float discountValue, float fidelityDiscount)
	{
	      return (1 - fidelityDiscount) * (price - discountValue);
	}
	
	private static float getFinalPrice(float price,float fidelityDiscount,ProductType type) {
		float discountValue=getDiscountValue(price, type.getDiscount());
		float finalPrice=getPriceWithDiscountAndFidelity(price,discountValue,fidelityDiscount);
  	    return finalPrice;
	}
	
	public float computePriceWithDiscount(ProductType productType, float price, int accountAge)
			throws InvalidPriceException, InvalidAgeException
	 {
		validator.validateAge(accountAge);
		validator.validatePrice(price);
		
		float discountValue=0;
	    float fidelityDiscount = (productType==ProductType.NEW) ? 0 : mkService.getFidelityDiscount(accountAge);
	    float finalPrice=getFinalPrice(price,fidelityDiscount,productType);
	    
	    return finalPrice; 
	  }
}