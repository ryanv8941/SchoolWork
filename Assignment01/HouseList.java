package Assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Contains an ArrayList of house objects. This information
 * comes from a file called houses.txt and adds the data to 
 * the list. Allows for searching for houses that meet the 
 * user criteria
 * 
 * @author Ryan Valensa
 * @version 2-28-2019 
 */

public class HouseList {

	private ArrayList <House> houseList = new ArrayList <House>();
	
	/**
	 * This constructor method reads each bit of data from the file
	 * creates a house object based on that data and then adds that
	 * object to an ArrayList
	 * 
	 * @param fileName
	 */
	public HouseList(String fileName) {
		
		Scanner fileIn = null;
		String address;
		int price;
		int area;
		int beds;
		
		try 
		{
			fileIn = new Scanner (new File(fileName));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File: " + fileName + " is not found");
		}
		
		while (fileIn.hasNextLine() ) {
			
			address = fileIn.next();
			price = fileIn.nextInt();
			area = fileIn.nextInt();
			beds = fileIn.nextInt();
			
			House currentHouse = new House(address, price, area, beds);
			 
			houseList.add(currentHouse);
			
		}
	}
	/**
	 * prints all the houses that are within the users criteria
	 * 
	 * @param c
	 * @return void
	 */
	public void printHouses(Criteria c) {
		int count = 0;
		for (House i: houseList) {
			
			if (i.satisfies(c)) {
				
				System.out.print(i.toString());
				count ++;
			}	
		}
		if (count == 0)
			System.out.print("There are no houses that match this search");
		System.out.println();
	}
	
	public String getHouses(Criteria c) {
		
		String housesThatMeetCriteria = "";
		
		for (House i: houseList) {
			
			if (i.satisfies(c)) {
				
				housesThatMeetCriteria = housesThatMeetCriteria + i.toString();
			}	
		}
			
		return housesThatMeetCriteria;
	}
}
