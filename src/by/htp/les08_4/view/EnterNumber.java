package by.htp.les08_4.view;

import java.util.Scanner;

public class EnterNumber {

	@SuppressWarnings("resource")
	public int enterNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Введите номер поезда: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(" Введите номер поезда: ");
		}
		int numberTrain = sc.nextInt();
		return numberTrain;
	}
}
