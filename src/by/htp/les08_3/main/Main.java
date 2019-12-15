package by.htp.les08_3.main;

import java.util.List;

import by.htp.les08_3.entity.Group;
import by.htp.les08_3.entity.Student;
import by.htp.les08_3.logic.GroupLogic;
import by.htp.les08_3.view.StudentsView;

public class Main {
	
public static void main (String[] args) {
	
	Group group = new Group(1, 10);
	
	группа . setStudents ( new  Student ( " Alex " , " Murrey " , new  int [] { 5 , 9 , 10 , 4 , 8 }));
	группа . setStudents ( new  Student ( " Alex " , " Smith " , new  int [] { 9 , 9 , 10 , 10 , 8 }));
	группа . setStudents ( new  Student ( " Alex " , " Trent " , new  int [] { 9 , 9 , 9 , 9 , 9 }));
	группа . setStudents ( new  Student ( " Alex " , " Bale " , new  int [] { 5 , 9 , 9 , 4 , 8 }));
	группа . setStudents ( new  Student ( " Alex " , " Murphy " , new  int [] { 7 , 9 , 10 , 6 , 8 }));
	группа . setStudents ( new  Student ( " Alex " , " Salah " , new  int [] { 10 , 10 , 10 , 9 , 10 }));
	группа . setStudents ( new  Student ( " Alex " , " Firminy " , new  int [] { 5 , 9 , 10 , 4 , 8 }));
	группа . setStudents ( new  Student ( " Alex " , " Klopp " , new  int [] { 5 , 9 , 10 , 4 , 8 }));
	группа . setStudents ( new  Student ( " Alex " , " Mane " , new  int [] { 5 , 9 , 10 , 4 , 8 }));
	группа . setStudents ( new  Student ( " Alex " , " Dake " , new  int [] { 8 , 9 , 10 , 10 , 9 }));
	StudentsView view = new StudentsView();
	GroupLogic grLogic = new GroupLogic();
	
	List<Student> aLevelStudents = grLogic.takeALevelStudents(group);
	
	view.printALevelStudents(group.getGroup(), aLevelStudents);
}
}
