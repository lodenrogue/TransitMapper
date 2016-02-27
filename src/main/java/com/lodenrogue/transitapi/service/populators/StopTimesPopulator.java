package com.lodenrogue.transitapi.service.populators;

import java.math.BigDecimal;

import com.lodenrogue.transitapi.model.StopTime;
import com.lodenrogue.transitapi.persistance.Database;
import com.lodenrogue.transitapi.utils.MathUtils;

public class StopTimesPopulator extends Populator<StopTime> {

	public StopTimesPopulator(Database database) {
		super(database);
	}

	@Override
	protected StopTime build() {
		StopTime stopTime = new StopTime();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("trip_id")) {
				stopTime.setTripId(row.get(i));
			}
			else if (headers[i].equals("arrival_time")) {
				stopTime.setArrivalTime(row.get(i));
			}
			else if (headers[i].equals("departure_time")) {
				stopTime.setDepartureTime(row.get(i));
			}
			else if (headers[i].equals("stop_id")) {
				stopTime.setStopId(row.get(i));
			}
			else if (headers[i].equals("stop_sequence")) {
				stopTime.setStopSequence(Integer.parseInt(row.get(i)));
			}
			else if (headers[i].equals("stop_headsign")) {
				stopTime.setStopHeadsign(row.get(i));
			}
			else if (headers[i].equals("stop_headsign")) {
				stopTime.setStopHeadsign(row.get(i));
			}
			else if (headers[i].equals("pickup_type")) {
				stopTime.setPickupType(MathUtils.parseInt(row.get(i), 0));
			}
			else if (headers[i].equals("drop_off_type")) {
				stopTime.setDropOffType(MathUtils.parseInt(row.get(i), 0));
			}
			else if (headers[i].equals("shape_dist_traveled")) {
				stopTime.setShapeDistTraveled(new BigDecimal(MathUtils.parseFloat(row.get(i), 0.0f)));
			}
			else if (headers[i].equals("timepoint")) {
				stopTime.setTimepoint(MathUtils.parseInt(row.get(i), 1));
			}
		}
		return stopTime;
	}
}
