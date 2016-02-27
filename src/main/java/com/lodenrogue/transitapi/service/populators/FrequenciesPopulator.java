package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.Frequency;
import com.lodenrogue.transitapi.persistance.Database;
import com.lodenrogue.transitapi.utils.MathUtils;

public class FrequenciesPopulator extends Populator<Frequency> {

	public FrequenciesPopulator(Database database) {
		super(database);
	}

	@Override
	protected Frequency build() {
		Frequency frequency = new Frequency();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("trip_id")) {
				frequency.setTripId(row.get(i));
			}
			else if (headers[i].equals("start_time")) {
				frequency.setStartTime(row.get(i));
			}
			else if (headers[i].equals("end_time")) {
				frequency.setEndTime(row.get(i));
			}
			else if (headers[i].equals("headway_secs")) {
				frequency.setHeadwaySecs(Integer.parseInt(row.get(i)));
			}
			else if (headers[i].equals("exact_times")) {
				frequency.setExactTimes(MathUtils.parseInt(row.get(i), 0));
			}
		}
		return frequency;
	}

}
