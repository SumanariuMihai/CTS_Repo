package ro.ase.acs.cts.laborator3;

public class Clasa1 {
	
	public static final int MAX_AGE_ACCOUNT=10;
	public static final float MAX_FIDELITY_DISCOUNT=0.15f;
	
	public float computePriceWithDiscount(ProductType productType, float price, int accountAge)
	  {
	    float finalPrice = 0;
	    float fidelityDiscount = (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIDELITY_DISCOUNT : (float)accountAge/100; 
	    if (productType == ProductType.NEW)
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
	    }
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