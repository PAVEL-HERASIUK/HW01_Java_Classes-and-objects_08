package by.htp.les08_10.main;

import by.htp.les08_10.entity.Airline;
import by.htp.les08_10.entity.Airport;
import by.htp.les08_10.logic.AirportLogic;
import by.htp.les08_10.view.AirportView;

public class Main {
	
	public  static  void  main ( String [] args, AirportView see ) {
		
		Airport airport = new Airport(" London ");
		airport.setAirlines(new Airline(" Los Angeles", 300, " passenger ", " 08.00 ", " monday, tuesday, wednesday, thursday, friday, saturday, sunday "));
		airport.setAirlines(new Airline("Cairo ", 350, " passenger", " 10.00 ", " monday, tuesday, wednesday, thursday, friday, saturday, sunday "));
		airport.setAirlines(new Airline(" Dabay ", 400, " passenger", " 12.00 ", " monday, tuesday, wednesday, thursday, friday, saturday, sunday"));
		airport.setAirlines(new Airline(" Rome ", 450, " passenger ", " 14.00 ", " saturday"));
	
		
		AirportLogic logic = new AirportLogic();
		
		AirportView view = new AirportView();
		see.printAirlines(logic.findByDestination(airport, "Los Angeles"));
		see.printAirlines(logic.findByDays(airport, "Tuesdya"));
		see.printAirlines(logic.findByDaysAndTime(airport, "Satuday", " 09.00"));
	}
}
