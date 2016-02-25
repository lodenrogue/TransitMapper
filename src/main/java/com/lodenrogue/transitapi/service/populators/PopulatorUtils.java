package com.lodenrogue.transitapi.service.populators;

import java.util.Calendar;

public class PopulatorUtils {

	private PopulatorUtils() {

	}

	/**
	 * Assumes date String is in YYYYMMDD format per GTFS requirements.
	 * 
	 * @param date
	 * @return
	 */
	public static Calendar parseDate(String date) {
		int year = Integer.valueOf(date.substring(0, 4));
		int month = Integer.valueOf(date.substring(4, 6));
		int day = Integer.valueOf(date.substring(6, 8));

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DATE, day);

		return calendar;
	}

}
