package Assignment01;
/**
 * This is a tester class for the program
 * 
 * @author Ryan Valensa
 * @version 2-28-2019
 *
 */

public class HouseListTester {

	public static void main (String[] args) {
		
		HouseList availableHouses = new HouseList("src/houses.txt");
		
		Criteria a = new Criteria (1000, 500000, 100, 5000, 0, 10);
		Criteria b = new Criteria (1000, 100000, 500, 1200, 0, 3);
		Criteria c = new Criteria (100000, 200000, 1000, 2000, 2, 3);
		Criteria d = new Criteria (200000, 300000, 1500, 4000, 3, 6);
		Criteria e = new Criteria (100000, 500000, 2500, 5000, 3, 6);
		Criteria f = new Criteria (150000, 300000, 1500, 4000, 3, 6);
		Criteria g = new Criteria (100000, 200000, 2500, 5000, 4, 6);
		
		
		System.out.println("Houses that meet criteria A are: ");
		availableHouses.printHouses(a);
		
		System.out.println("Houses that meet criteria B are: ");
		availableHouses.printHouses(b);
		
		System.out.println("Houses that meet criteria C are: ");
		availableHouses.printHouses(c);
		
		System.out.println("Houses that meet criteria D are: ");
		availableHouses.printHouses(d);
		
		System.out.println("Houses that meet criteria E are: ");
		availableHouses.printHouses(e);
		
		System.out.println("Houses that meet criteria F are: ");
		availableHouses.printHouses(f);
		
		System.out.println("Houses that meet criteria G are: ");
		availableHouses.printHouses(g);
		
		
		
		
	}
}
