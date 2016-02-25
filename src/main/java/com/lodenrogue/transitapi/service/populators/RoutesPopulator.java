package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.Database;
import com.lodenrogue.transitapi.model.Route;

public class RoutesPopulator extends Populator<Route> {

	public RoutesPopulator(Database database) {
		super(database);
	}

	@Override
	protected Route build() {
		Route route = new Route();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("route_id")) {
				route.setRouteId(row.get(i));
			}
			else if (headers[i].equals("agency_id")) {
				route.setAgencyId(row.get(i));
			}
			else if (headers[i].equals("route_short_name")) {
				route.setShortName(row.get(i));
			}
			else if (headers[i].equals("route_long_name")) {
				route.setLongName(row.get(i));
			}
			else if (headers[i].equals("route_desc")) {
				route.setDescription(row.get(i));
			}
			else if (headers[i].equals("route_type")) {
				route.setType(Integer.parseInt(row.get(i)));
			}
			else if (headers[i].equals("route_url")) {
				route.setUrl(row.get(i));
			}
			else if (headers[i].equals("route_color")) {
				route.setColor(row.get(i));
			}
			else if (headers[i].equals("route_text_color")) {
				route.setTextColor(row.get(i));
			}
		}
		return route;
	}

}
