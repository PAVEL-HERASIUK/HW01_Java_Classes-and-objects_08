package by.htp.les08_6.logic;

import by.htp.les08_6.entity.Time;

public class TimeLogic {

	public int[] NewTime(int[] userTime, Time time) {

		int toMinute = (time.getSecond() + userTime[2]) / 60;
		int second = (time.getSecond() + userTime[2]) % 60;
		int toHour = (time.getMinyte() + userTime[1] + toMinute) / 60;
		int minyte = (time.getMinyte() + userTime[1] + toMinute) % 60;
		int hour = time.getHour() + userTime[0] + toHour;

		if (second < 0) {
			second = 0;
		}
		if (minyte < 0) {
			minyte = 0;
		}
		if (hour < 0) {
			hour = 0;
		}

		int[] newTime = { hour, minyte, second };

		return newTime;
	}
}
