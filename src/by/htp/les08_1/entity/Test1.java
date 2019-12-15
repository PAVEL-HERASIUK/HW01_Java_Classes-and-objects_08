package by.htp.les08_1.entity;

public class Test1 {

	// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
	// методы изменения этих переменных.
	// Добавьте метод, который находит сумму значений этих переменных, и метод,
	// который находит наибольшее значение из этих двух переменных.

	private int x;
	private int y;

	public Test1() {
		this.x = 0;
		this.y = 0;
	}

	public Test1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int simple = 31;
		int result = 1;
		result = simple * result + x;
		result = simple * result + y;
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;
		Test1 other = (Test1) object;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
