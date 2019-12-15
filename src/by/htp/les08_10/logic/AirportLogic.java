package by.htp.les08_10.logic;

import java.util.List;
import java.util.ArrayList;
import by.htp.les08_10.entity.Airline;
import by.htp.les08_10.entity.Airport;

public class AirportLogic {

	public List<Airline> findByDestination(Airport airport, String destination) {
		int i;
		List<Airline> Airlines = airport.getAirlines();
		List<Airline> findAirlines = new ArrayList<Airline>();

		for (i = 0; i < Airlines.size(); i++) {
			if (Airlines.get(i).getDestination().compareTo(destination) == 0) {
				findAirlines.add(Airlines.get(i));
			}
		}
		return findAirlines;
	}

	public List<Airline> findByDays(Airport airport, String day) {
		int i;
		List<Airline> Airlines = airport.getAirlines();
		List<Airline> findAirlines = new ArrayList<Airline>();

		for (i = 0; i < Airlines.size(); i++) {
			if (Airlines.get(i).getDays().contains(day)) {
				findAirlines.add(Airlines.get(i));
			}
		}
		return findAirlines;
	}

	public List<Airline> findByDaysAndTime(Airport airport, String day, String time) {
		int i;
		List<Airline> Airlines = airport.getAirlines();
		List<Airline> findAirlines = new ArrayList<Airline>();

		for (i = 0; i < Airlines.size(); i++) {
			if (Airlines.get(i).getDays().contains(day)) {
				if (Airlines.get(i).getDepartureTime().compareTo(time) > 0) {
					findAirlines.add(Airlines.get(i));
				}
			}
		}
		return findAirlines;
	}
}
