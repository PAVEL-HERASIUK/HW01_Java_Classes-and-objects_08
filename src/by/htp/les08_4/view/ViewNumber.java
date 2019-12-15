package by.htp.les08_4.view;

import java.util.List;
import by.htp.les08_4.entity.Train;

public class ViewNumber {

	public void viewNumber(List<Train> trains, int number) {
		boolean resolution = false;
		int i;
		for (i = 0; i < trains.size(); i++) {
			if (number == trains.get(i).getNumberTrain()) {
				resolution = true;
				break;
			}
		}
		if (resolution) {
			System.out.println(" Номер поезда: " + trains.get(i).getNumberTrain());
			System.out.println(" Конечная станция: " + trains.get(i).getDestinationStation());
			System.out.println(" Время прибытия: " + trains.get(i).getDepartureHours() + " ч.\n "
					+ trains.get(i).getDepartureMinutes() + " мин. \n");
		} else {
			System.out.println(" Поездов нет! \n ");
		}
	}
}
