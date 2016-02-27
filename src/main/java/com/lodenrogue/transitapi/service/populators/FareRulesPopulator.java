package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.FareRule;
import com.lodenrogue.transitapi.persistance.Database;

public class FareRulesPopulator extends Populator<FareRule> {

	public FareRulesPopulator(Database database) {
		super(database);
	}

	@Override
	protected FareRule build() {
		FareRule rule = new FareRule();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("fare_id")) {
				rule.setFareId(row.get(i));
			}
			else if (headers[i].equals("route_id")) {
				rule.setRouteId(row.get(i));
			}
			else if (headers[i].equals("origin_id")) {
				rule.setOriginId(row.get(i));
			}
			else if (headers[i].equals("destination_id")) {
				rule.setDestinationId(row.get(i));
			}
			else if (headers[i].equals("contains_id")) {
				rule.setContainsId(row.get(i));
			}
		}
		return rule;
	}

}
