package Assignment01;
/**
 * This class represents the details of a house 
 * for sale
 * @author Ryan Valensa
 * @version 2-28-2019
 *
 */
public class House {
	
	private String address;
	private int price;
	private int area;
	private int numBedrooms;
	
	/**
	 * constructor method which initializes all of the instance variables
	 * 
	 * @param address
	 * @param price
	 * @param area
	 * @param numBedrooms
	 */
	public House (String address, int price, int area, int numBedrooms) {
		
		this.address = address;
		this.price = price;
		this.area = area;
		this.numBedrooms = numBedrooms;
		
	}
	/**
	 * get method to return address for this object
	 * 
	 * @return 
	 */
	public String getAddress() { return address; }
	
	/**
	 * get method to return price for this object
	 * 
	 * @return 
	 */
	public int getPrice() { return price; }
	
	/**
	 * get method to return area for this object
	 * 
	 * @return 
	 */
	public int getArea() { return area; }
	
	/**
	 * get method to return number of bedrooms for this object
	 * 
	 * @return 
	 */
	public int getNumBedrooms() { return numBedrooms; }
	
	/**
	 * satisfies method that returns a boolean value of true when this
	 * object satisfies user criteria and false when it does not
	 * 
	 * @return 
	 */
	public boolean satisfies (Criteria c) {
		
		return price <= c.getMaximumPrice() && price >= c.getMinimumPrice() &&
			   area <= c.getMaximumArea() && area >= c.getMinimumArea() &&
			   numBedrooms <= c.getMaximumNumberOfBedrooms() && numBedrooms >= c.getMinimumNumberOfBedrooms();	
	}
	
	/**
	 * toString method turns all the data for this object into a nice string
	 * 
	 * 
	 * @return String output
	 */
	public String toString() {
		
		String output = address + "  " + price + "  " + area + "  " + "  " + numBedrooms + "\n";
		
		return output;
	}
}
