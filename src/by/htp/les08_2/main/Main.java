package by.htp.les08_2.main;

import by.htp.les08_2.entity.Test2;
import by.htp.les08_2.view.ViewTest2;

public class Main {
	public static void main(String[] args, ViewTest2 see) {

		Test2 test1 = new Test2();

		Test2 test2 = new Test2(1, 2);

		ViewTest2 view = new ViewTest2();

		see.printTest2 (test1);
		see.printTest2 (test2);

	}
}
