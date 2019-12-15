package by.htp.les08_5.logic;

import by.htp.les08_5.entity.Counter;

public class CounterLogic {
	public void increase(Counter counter) {
		if (counter.getCurrentState() < counter.getMax()) {
			counter.setCurrentState(counter.getCurrentState() + 1);
		} else {
			counter.setCurrentState(counter.getMin());
		}
	}

	public void reduction(Counter counter) {
		if (counter.getCurrentState() > counter.getMin()) {
			counter.setCurrentState(counter.getCurrentState() - 1);
		} else {
			counter.setCurrentState(counter.getMax());
		}
	}
}
