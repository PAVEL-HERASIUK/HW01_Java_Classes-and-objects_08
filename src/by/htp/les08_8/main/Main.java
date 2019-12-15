package by.htp.les08_8.main;

import java.util.ArrayList;
import java.util.List;
import by.htp.les08_8.entity.Customer;
import by.htp.les08_8.logic.CustomerLogic;
import by.htp.les08_8.view.ViewCustomers;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1, "Татьяна", "Савицкая", "Николаевна", "Гродно", 1234, 0001);
		Customer customer2 = new Customer(2, "Ольга", "Иванова", "Ивановна", "Минск", 1235, 0002);
		Customer customer3 = new Customer(4, "Мария", "Кузнецова", "Викторовна", "Брест", 1236, 0003);
		Customer customer4 = new Customer(5, "Анастасия", "Попова", "Семеновна", "Витебск", 1237, 0004);
		Customer customer5 = new Customer(3, "Виктория", "Егорова", " Францовна", "Гомель", 1238, 0005);
		Customer customer6 = new Customer(6, "Ангелина", "Степанова", "Андреевна", "Могилев", 1239, 0006);

		List<Customer> customers = new ArrayList<Customer>();

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);

		ViewCustomers view = new ViewCustomers();

		ViewCustomers see = null;
		see.viewCustomers(customers);

		CustomerLogic logic = new CustomerLogic();

		customers = logic.sortSurname(customers);
		see.viewCustomers(customers);

		// Search by credit card number

		int min = logic.minNumberCard(customers);
		int max = logic.maxNumberCard(customers);

		int minNumberCard = view.enterMinNumberCard(customers, min, max);
		int maxNumberCard = view.enterMaxNumberCard(customers, minNumberCard, max);
		List<Customer> customersCard = logic.customersNumberCard(customers, minNumberCard, maxNumberCard);
		see.viewCustomers(customersCard);
	}
}
