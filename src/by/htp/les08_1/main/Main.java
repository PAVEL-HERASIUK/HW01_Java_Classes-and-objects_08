package by.htp.les08_1.main;

import by.htp.les08_1.entity.Test1;
import by.htp.les08_1.logic.LogicTest1;
import by.htp.les08_1.view.View;

public class Main {

	public static void main(String[] args, View see) {
		Test1 number = new Test1(1, 2);
		int x = number.getY();
		int y = number.getY();

		LogicTest1 logic = new LogicTest1();
		int sum = logic.sumTest1(x, y);
		int largeNumber = logic.bigNumberTest1(x, y);

		View view = new View();
		see.viewTest1(sum);
		see.viewTest1(largeNumber);

	}
}