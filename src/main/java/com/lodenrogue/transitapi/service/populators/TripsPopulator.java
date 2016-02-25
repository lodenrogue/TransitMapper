package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.Database;
import com.lodenrogue.transitapi.model.Trip;
import com.lodenrogue.transitapi.utils.MathUtils;

public class TripsPopulator extends Populator<Trip> {

	public TripsPopulator(Database database) {
		super(database);
	}

	@Override
	protected Trip build() {
		Trip trip = new Trip();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("trip_id")) {
				trip.setTripId(row.get(i));
			}
			else if (headers[i].equals("route_id")) {
				trip.setRouteId(row.get(i));
			}
			else if (headers[i].equals("service_id")) {
				trip.setServiceId(row.get(i));
			}
			else if (headers[i].equals("trip_headsign")) {
				trip.setHeadsign(row.get(i));
			}
			else if (headers[i].equals("trip_short_name")) {
				trip.setShortName(row.get(i));
			}
			else if (headers[i].equals("direction_id") && !row.get(i).equals("")) {
				trip.setDirectionId(Integer.parseInt(row.get(i)));
			}
			else if (headers[i].equals("block_id")) {
				trip.setBlockId(row.get(i));
			}
			else if (headers[i].equals("shape_id")) {
				trip.setShapeId(row.get(i));
			}
			else if (headers[i].equals("wheelchair_accessible")) {
				trip.setWheelchairAccessible(MathUtils.parseInt(row.get(i), 0));
			}
			else if (headers[i].equals("bikes_allowed")) {
				trip.setBikesAllowed(MathUtils.parseInt(row.get(i), 0));
			}

		}
		return trip;
	}

}
