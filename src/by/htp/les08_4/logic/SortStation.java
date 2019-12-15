package by.htp.les08_4.logic;

import java.util.List;
import by.htp.les08_4.entity.Train;

public class SortStation {
	public List<Train> sortStation(List<Train> trains) {
		int i = 0;
		while (i < trains.size() - 1) {
			if (trains.get(i).getDestinationStation().compareTo(trains.get(i + 1).getDestinationStation()) > 0) {
				Train temp = trains.get(i + 1);
				trains.set(i + 1, trains.get(i));
				trains.set(i, temp);
				i = 0;
			} else {
				i++;
			}
		}
		return trains;
	}
}
