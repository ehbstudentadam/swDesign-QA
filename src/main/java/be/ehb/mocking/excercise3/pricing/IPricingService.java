package be.ehb.mocking.excercise3.pricing;

import java.math.BigDecimal;

public interface IPricingService {
	void setDataAccess(IDataAccess dataAccess);

	BigDecimal getPrice(String id) throws ProductNotFoundException;
}
 