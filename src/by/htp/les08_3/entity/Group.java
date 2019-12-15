package by.htp.les08_3.entity;

import java.util.Arrays;

public class Group {
	private int numberGroup;
	private Student[] students;
	private int quantity;

	public Group(int number, int quantity, int numberGroup) {
		this.numberGroup = numberGroup;
		this.quantity = quantity;
		this.students = new Student[quantity];
	}

	public int getNumberGroup() {
		return numberGroup;
	}

	public void setNumberGroup(int numberGroup) {
		this.numberGroup = numberGroup;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int nextEmptyCell = 0;

	public void setStudents(Student students) {
		if (nextEmptyCell < 10) {

			Object[] student = null;

			student[nextEmptyCell] = students;

			nextEmptyCell++;
		}
	}

	public Student getStudents(int index) {
		return students[index];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberGroup;
		result = prime * result + quantity;
		result = prime * result + Arrays.hashCode(students);
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
		Group other = (Group) obj;
		if (numberGroup != other.numberGroup)
			return false;
		if (quantity != other.quantity)
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}
}
