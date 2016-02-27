package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.ServiceCalendar;
import com.lodenrogue.transitapi.persistance.Database;

public class ServiceCalendarPopulator extends Populator<ServiceCalendar> {

	public ServiceCalendarPopulator(Database database) {
		super(database);
	}

	@Override
	protected ServiceCalendar build() {
		ServiceCalendar serviceCalendar = new ServiceCalendar();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("service_id")) {
				serviceCalendar.setServiceId(row.get(i));
			}
			else if (headers[i].equals("monday")) {
				serviceCalendar.setMonday(parseBoolean(row.get(i)));
			}
			else if (headers[i].equals("tuesday")) {
				serviceCalendar.setTuesday(parseBoolean(row.get(i)));
			}
			else if (headers[i].equals("wednesday")) {
				serviceCalendar.setWednesday(parseBoolean(row.get(i)));
			}
			else if (headers[i].equals("thursday")) {
				serviceCalendar.setThursday(parseBoolean(row.get(i)));
			}
			else if (headers[i].equals("friday")) {
				serviceCalendar.setFriday(parseBoolean(row.get(i)));
			}
			else if (headers[i].equals("saturday")) {
				serviceCalendar.setSaturday(parseBoolean(row.get(i)));
			}
			else if (headers[i].equals("sunday")) {
				serviceCalendar.setSunday(parseBoolean(row.get(i)));
			}
			else if (headers[i].equals("start_date")) {
				serviceCalendar.setStartDate(PopulatorUtils.parseDate(row.get(i)));
			}
			else if (headers[i].equals("end_date")) {
				serviceCalendar.setEndDate(PopulatorUtils.parseDate(row.get(i)));
			}
		}
		return serviceCalendar;
	}

	/**
	 * Takes in a string representation "1" or "0" and returns true or false.
	 * If something other than "1" or "0" is passed as the parameter then it
	 * returns false
	 * 
	 * @param data
	 * @return
	 */
	private boolean parseBoolean(String data) {
		if (data.equals("1")) {
			return true;
		}
		else {
			return false;
		}
	}

}
