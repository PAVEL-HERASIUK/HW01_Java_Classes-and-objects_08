package by.htp.les08_8.view;

import java.util.List;
import by.htp.les08_8.entity.Customer;
import java.util.Scanner;

public class ViewCustomers {

	public void viewCustomers(List<Customer> customers) {
		for (int i = 0; i < customers.size(); i++) {
			System.out.println("Идентификатор покупателя" + customers.get(i).getId() + " : ");
			System.out.println(customers.get(i).getSurname() + "  " + customers.get(i).getName() + "  "
					+ customers.get(i).getPatronymic());
			System.out.println("Адрес: " + customers.get(i).getAddress());
			System.out.println("Номер кредитной карты: " + customers.get(i).getNumberCard());
			System.out.println("Номер банковского счета: " + customers.get(i).getNumberAccount() + " \n ");
		}
	}

	public int enterMinNumberCard(List<Customer> customers, int min, int max) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
		}
		int minNumberCard = sc.nextInt();
		while (minNumberCard < min || minNumberCard > max) {
			System.out.print(" Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
			}
			minNumberCard = sc.nextInt();
		}
		return minNumberCard;
	}

	public int enterMaxNumberCard(List<Customer> customers, int minNumberCard, int max) {
		int min = minNumberCard;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(" Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
		}
		int maxNumberCard = sc.nextInt();
		while (maxNumberCard < min || maxNumberCard > max) {
			System.out.print(" Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Введите значение кредитной карты в диапазоне от " + min + " до " + max + " : ");
			}
			maxNumberCard = sc.nextInt();
		}
		return maxNumberCard;
	}
}
