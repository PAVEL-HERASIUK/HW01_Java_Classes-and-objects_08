package by.htp.les08_10.view;

import java.util.List;
import by.htp.les08_10.entity.Airline;

public class AirportView {
	public void printAirlines(List<Airline> Airlines) {

		int i;
		System.out.println(" findByAirlines:");
		for (i = 0; i < Airlines.size(); i++) {
			System.out.println(Airlines.get(i).toString());
		}
	}
}
