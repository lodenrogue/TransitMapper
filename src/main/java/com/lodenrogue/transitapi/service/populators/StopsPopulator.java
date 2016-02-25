package com.lodenrogue.transitapi.service.populators;

import java.math.BigDecimal;

import com.lodenrogue.transitapi.model.Database;
import com.lodenrogue.transitapi.model.Stop;
import com.lodenrogue.transitapi.utils.MathUtils;

public class StopsPopulator extends Populator<Stop> {

	public StopsPopulator(Database database) {
		super(database);
	}

	@Override
	protected Stop build() {
		Stop stop = new Stop();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("stop_id")) {
				stop.setStopId(row.get(i));
			}
			else if (headers[i].equals("stop_code")) {
				stop.setCode(row.get(i));
			}
			else if (headers[i].equals("stop_name")) {
				stop.setName(row.get(i));
			}
			else if (headers[i].equals("stop_desc")) {
				stop.setDescription(row.get(i));
			}
			else if (headers[i].equals("stop_lat")) {
				stop.setLat(new BigDecimal(row.get(i)));
			}
			else if (headers[i].equals("stop_lon")) {
				stop.setLon(new BigDecimal(row.get(i)));
			}
			else if (headers[i].equals("zone_id")) {
				stop.setZoneId(row.get(i));
			}
			else if (headers[i].equals("stop_url")) {
				stop.setUrl(row.get(i));
			}
			else if (headers[i].equals("location_type")) {
				stop.setLocationType(MathUtils.parseInt(row.get(i), 0));
			}
			else if (headers[i].equals("parent_station")) {
				stop.setParentStation(row.get(i));
			}
			else if (headers[i].equals("stop_timezone")) {
				stop.setTimezone(row.get(i));
			}
			else if (headers[i].equals("wheelchair_boarding")) {
				stop.setWheelchairBoarding(MathUtils.parseInt(row.get(i), 0));
			}
		}
		return stop;
	}

}
