package by.htp.les08_6.entity;

public class Time {
	// 6. Составьте описание класса для представления времени. Предусмотрте
	// возможности установки времени и
	// изменения его отдельных полей (час, минута, секунда) с проверкой допустимости
	// вводимых значений. В случае
	// недопустимых значений полей поле устанавливается в значение 0. Создать методы
	// изменения времени на заданное
	// количество часов, минут и секунд
	private int hour;
	private int minyte;
	private int second;

	public Time() {
		this.hour = 0;
		this.minyte = 0;
		this.second = 0;
	}

	public Time(int hour, int minyte, int second) {
		if (hour > 0 && hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
		if (minyte > 0 && minyte <= 60) {
			this.minyte = minyte;
		} else {
			this.minyte = 0;
		}
		if (second > 0 && second <= 60) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinyte() {
		return minyte;
	}

	public void setMinyte(int minyte) {
		this.minyte = minyte;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minyte;
		result = prime * result + second;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minyte != other.minyte)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minyte=" + minyte + ", second=" + second + "]";
	}
}
