package clocks;

public class ClockTester {

	public static void main (String[] args) {
		
		Clock myClock = new Clock();
		
		System.out.print("Current time is: " );
		System.out.print(myClock.getHour() + " hours, " );
		System.out.print(myClock.getMinute() + " minutes, and " );
		System.out.print(myClock.getSecond() + " seconds." );
	}
}
