package ro.ase.acs.cts.laborator3.phase3.test;

import ro.ase.acs.cts.laborator3.phase3.Product;
import ro.ase.acs.cts.laborator3.phase3.ProductType;
import ro.ase.acs.cts.laborator3.phase3.services.Marketing2021Strategy;
import ro.ase.acs.cts.laborator3.phase3.services.MarketingServiceInterface;
import ro.ase.acs.cts.laborator3.phase3.services.ValidatorService;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidPriceException;

public class TestProduct {

	public static void main(String[] args) {
		
		
		Product product=new Product(new Marketing2021Strategy(), 
									new ValidatorService());
		try {
			float finalPrice=product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is: "+finalPrice);
			
			product.setMarketingService(new MarketingServiceInterface() {
				
				@Override
				public float getFidelityDiscount(int accountAge) {
					// TODO Auto-generated method stub
					return 0.3f;
				}
			});
			
			finalPrice=product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is: "+finalPrice);
			
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}
