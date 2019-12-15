package by.htp.les08_3.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les08_3.entity.Group;
import by.htp.les08_3.entity.Student;

public class GroupLogic {

	private StudentLogic stLogic = new StudentLogic();

	public List<Student> takeALevelStudents(Group group) {
		List<Student> resuls = new ArrayList<Student>();
		int i;
		for (i = 0; i < group.getStudents().length; i++) {
			Object stLogic;
			if (stLogic.isALevel(group.getStudents(i))) {
				List<Student> results;
				results.add(group.getStudents(i));
			}
		}
		List<Student> results;
		return results;
		// и каждый раз организовывая в цикле перевобор студентов в вашей группе,
		// если студент из isAlevel добавлять в этот список: List<Student>resuls= new
		// ArrayList<Student>();
		// а потом просто список вернуть.

		// Задача метода получить группу студентов, найти в этой группе студентов всех
		// отличников и
		// поместить этих отличников в другую коллекцию или другой массив и вернуть тому
		// кто его вызывает
	}
}
