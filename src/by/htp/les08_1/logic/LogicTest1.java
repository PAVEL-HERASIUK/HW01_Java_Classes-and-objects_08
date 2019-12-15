package by.htp.les08_1.logic;

public class LogicTest1 {

	public int sumTest1(int x, int y) {

		int sum;
		sum = x + y;
		return sum;
	}

	public int bigNumberTest1(int x, int y) {
		int bigNumber;
		if (x > y) {
			bigNumber = x;
		} else {
			bigNumber = y;
		}
		return bigNumber;
	}
}
