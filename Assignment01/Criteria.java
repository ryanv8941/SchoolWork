package Assignment01;

public class Criteria {
	
	private int minimumPrice;
	private int maximumPrice;
	private int minimumArea;
	private int maximumArea;
	private int minimumNumberOfBedrooms;
	private int maximumNumberOfBedrooms;
	
	/**
	 * constructor class
	 * 
	 * 
	 */
	public Criteria(int minPrice, int maxPrice, int minArea, int maxArea, int minBed, int maxBed) {
		
		minimumPrice = minPrice;
		maximumPrice = maxPrice;
		minimumArea = minArea;
		maximumArea = maxArea;
		minimumNumberOfBedrooms = minBed;
		maximumNumberOfBedrooms = maxBed;
				
	}
	
	public int getMinimumPrice() { return minimumPrice; }
	public int getMaximumPrice() { return maximumPrice; }
	public int getMinimumArea() { return minimumArea; }
	public int getMaximumArea() { return maximumArea; }
	public int getMinimumNumberOfBedrooms() { return minimumNumberOfBedrooms; }
	public int getMaximumNumberOfBedrooms() { return maximumNumberOfBedrooms; }
	
}
