package clocks;

import java.util.*;
import java.text.*;
public class Clock implements IClock {

	private int second; //current time in hrs, mins and seconds 

    private int minute; 

    private int hour; 

     

    public Clock() 

    { 

  // The clock gets current time from the GregorianCalendar class 

        GregorianCalendar date = new GregorianCalendar(); 

        second = date.get(Calendar.SECOND); 

        minute = date.get(Calendar.MINUTE); 

        hour   = date.get(Calendar.HOUR); 

    } 

    // Write the getHour, getMinute and getSecond methods 

    
     public int getSecond() {return second;}
     
     public int getMinute() {return minute;}
     
     public int getHour()   {return hour;}

} 

