package by.htp.les08_6.main;

import by.htp.les08_6.entity.Time;
import by.htp.les08_6.logic.TimeLogic;
import by.htp.les08_6.logic.UserTimeLogic;
import by.htp.les08_6.view.ViewTime;

public class Main {
	
	public static void main(String[] args) {

		Time time = new Time();
		TimeLogic logic = new TimeLogic();
		time.setHour(10);
		time.setMinyte(20);
		time.setSecond(30);

		ViewTime viewTime = new ViewTime();
		viewTime.viewTimeStart(time);

		int[] userTime = new int[3];
		userTime = viewTime.enterNum();

		int[] newTime = logic.NewTime(userTime, time);

		viewTime.viewTime(newTime);
	}
}
