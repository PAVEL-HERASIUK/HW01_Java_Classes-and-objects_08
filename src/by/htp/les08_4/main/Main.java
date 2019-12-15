package by.htp.les08_4.main;

import by.htp.les08_4.entity.Depo;
import by.htp.les08_4.entity.Train;
import by.htp.les08_4.logic.SortNumber;
import by.htp.les08_4.logic.SortStation;
import by.htp.les08_4.view.EnterNumber;
import by.htp.les08_4.view.ViewNumber;
import by.htp.les08_4.view.ViewDepo;

public class Main {

	public static void main(String[] args, ViewNumber viewNumber) {

		Train train1 = new Train(" Скидель ", 1, 8, 10);
		Train train2 = new Train(" Глиняны ", 2, 9, 20);
		Train train3 = new Train(" Некраши ", 3, 10, 30);
		Train train4 = new Train(" Обухово ", 4, 11, 40);
		Train train5 = new Train(" Песчанка", 5, 12, 50);

		Depo train = new Depo();

		train.getTrains().add(train1);
		train.getTrains().add(train2);
		train.getTrains().add(train3);
		train.getTrains().add(train4);
		train.getTrains().add(train5);

		// Sort by number

		SortNumber sort = new SortNumber();
		train.setTrains(sort.sortNumber(train.getTrains()));

		ViewDepo viewDepo = new ViewDepo();
		viewDepo.viewDepo(train.getTrains());

		// Search by train number

		EnterNumber enterNumber = new EnterNumber();
		int number = enterNumber.enterNumber();

		ViewNumber.viewNumber = new ViewNumber();
		viewNumber.viewNumber(train.getTrains(), number);

		// Station sort

		SortStation station = new SortStation();
		train.setTrains(station.sortStation(train.getTrains()));
		viewDepo.viewDepo(train.getTrains());
	}
}
