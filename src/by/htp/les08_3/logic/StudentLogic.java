package by.htp.les08_3.logic;

import by.htp.les08_3.entity.Student;

public class StudentLogic {
	
	public boolean isALevelStudent(Student st) {
		
		int [] marks = st.getMarks();
		int count = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] == 9 || marks[i] == 10) {
			}
			return ;
		}
	}
}
