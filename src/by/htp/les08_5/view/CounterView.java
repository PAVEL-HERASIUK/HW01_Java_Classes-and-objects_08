package by.htp.les08_5.view;

import by.htp.les08_5.entity.Counter;

public class CounterView {
	public void printCurrentState(String mes, Counter counter) {
		System.out.println(" Текущее состояние " + mes + " : " + counter.getCurrentState());
	}
}
