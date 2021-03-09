package ro.ase.acs.cts.laborator3;

import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidPriceException;

public class Product {
	
	public static final int MAX_AGE_ACCOUNT=10;
	public static final float MAX_FIDELITY_DISCOUNT=0.15f;
	
	public float computePriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidPriceException, InvalidAgeException
	 {
		if(price<=0) {
			throw new InvalidPriceException();
		}
		if(accountAge<0) {
			throw new InvalidAgeException();
		}
		
		
	    float finalPrice = 0;
	    float fidelityDiscount = (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float)accountAge/100; 
	    
	    switch(productType) {
	    case NEW:
	    	finalPrice=price;
	    	break;
	    case DISCOUNTED:
		      finalPrice = (price - (ProductType.DISCOUNTED.getDiscountValue() * price)) - fidelityDiscount * (price - (ProductType.DISCOUNTED.getDiscountValue() * price));
		      break;
	    case LIMITED_STOCK:
		      finalPrice = (price - (ProductType.LIMITED_STOCK.getDiscountValue() * price)) - fidelityDiscount * (price - (ProductType.LIMITED_STOCK.getDiscountValue() * price));
		      break;
	    case LEGACY:
		      finalPrice = (price - (ProductType.LEGACY.getDiscountValue() * price)) - fidelityDiscount * (price - (ProductType.LEGACY.getDiscountValue() * price));
		      break;
		      default:
		    	  throw new UnsupportedOperationException("The enum type is not covered!");
	    }
	    
	    
	    /*if (productType == ProductType.NEW)
	    {
	      finalPrice = price;
	    }
	    else if (productType == ProductType.DISCOUNTED)
	    {
	      finalPrice = (price - (ProductType.DISCOUNTED.getDiscountValue() * price)) - fidelityDiscount * (price - (ProductType.DISCOUNTED.getDiscountValue() * price));
	    }
	    else if (productType == ProductType.LIMITED_STOCK)
	    {
	      finalPrice = (price - (ProductType.LIMITED_STOCK.getDiscountValue() * price)) - fidelityDiscount * (price - (ProductType.LIMITED_STOCK.getDiscountValue() * price));
	    }
	    else if (productType == ProductType.LEGACY)
	    {
	      finalPrice = (price - (ProductType.LEGACY.getDiscountValue() * price)) - fidelityDiscount * (price - (ProductType.LEGACY.getDiscountValue() * price));
	    }*/
	    return finalPrice;
	  }
}


/*public class Clasa1 {
public float Calculeaza(int t, float s, int perioada)
{
  float rezultat = 0;
  float valoare = (perioada > 10) ? (float)15/100 : (float)perioada/100; 
  if (t == 1)
  {
    rezultat = s;
  }
  else if (t == 2)
  {
    rezultat = (s - (0.1f * s)) - valoare * (s - (0.1f * s));
  }
  else if (t == 3)
  {
    rezultat = (s - (0.25f * s)) - valoare * (s - (0.25f * s));
  }
  else if (t == 4)
  {
    rezultat = (s - (0.35f * s)) - valoare * (s - (0.35f * s));
  }
  return rezultat;
}
}*/