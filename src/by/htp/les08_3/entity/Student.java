package by.htp.les08_3.entity;

import java.util.Arrays;

public class Student {
	private String name;
	private int[] marks = new int[MARK_COUNT];
	private String surname;
	private static final int MARK_COUNT = 5;
	private int numberGroup;

	public Student() {
	}

	public Student(String name, String surname, int[] marks, int numberGroup) {
		this.name = name;
		this.surname = surname;
		this.marks = marks;
		this.numberGroup = numberGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int[] getNumberGroup() {
		return numberGroup;
	}

	public void setNumberGroup(int[] numberGroup) {
		this.numberGroup = numberGroup;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(numberGroup);
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Student other = (Student) obj;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(numberGroup, other.numberGroup))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
}
