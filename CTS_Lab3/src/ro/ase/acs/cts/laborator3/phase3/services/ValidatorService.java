package ro.ase.acs.cts.laborator3.phase3.services;

import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidAgeException;
import ro.ase.acs.cts.laborator3.refactor.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorServiceInterface{

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if(price<=0)
			throw new InvalidPriceException();
		
	}

	@Override
	public void validateAge(int accountAge) throws InvalidAgeException {
		if(accountAge<0)
			throw new InvalidAgeException();
	}
	
}
