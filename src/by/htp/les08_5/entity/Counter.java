package by.htp.les08_5.entity;

public class Counter {
	// 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать
	// или уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
	// по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения
	// состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
	// возможности класса.

	private int currentState = 0;
	private int min = -5;
	private int max = 10;

	public Counter() {
	}

	public Counter(int min, int max, int currentState) {
		this.min = min;
		this.max = max;
		if ((currentState <= max) && (currentState >= min)) {
			this.currentState = currentState;
		} else {
			this.currentState = min;
			System.out.println("Текущее состояние не принадлежит этому счетчику. Текущее состояние =  " + min);
		}
	}

	public int getCurrentState() {
		return currentState;
	}

	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentState;
		result = prime * result + max;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (currentState != other.currentState)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [currentState=" + currentState + ", min=" + min + ", max=" + max + "]";
	}
}
