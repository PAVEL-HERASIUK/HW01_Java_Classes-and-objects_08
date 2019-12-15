package by.htp.les08_5.main;

import by.htp.les08_5.entity.Counter;
import by.htp.les08_5.logic.CounterLogic;
import by.htp.les08_5.view.CounterView;

public class Main {
    //  5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
	//единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
	//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
	//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
	public static void main(String[] args, CounterView see) {

		Counter counter1 = new Counter();
		Counter counter2 = new Counter(2, 3, 4);

		CounterView view = new CounterView();
		
		see.printCurrentState(" counter1 ", counter1);
		see.printCurrentState(" counter2 ", counter2);

		CounterLogic changeCurrent = new CounterLogic();
		
		changeCurrent.increase(counter2);
		see.printCurrentState(" counter2 ", counter2);
		changeCurrent.increase(counter2);
		see.printCurrentState(" counter2 ", counter2);

		changeCurrent.reduction(counter1);
		
		see.printCurrentState(" counter1 ", counter1);

	}

}
