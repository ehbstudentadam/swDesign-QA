 package be.ehb.mocking.excercise3.pricing;
 
 import java.math.BigDecimal;
 
 public interface IDataAccess {
     BigDecimal getPriceByID(String ID);
 }
 