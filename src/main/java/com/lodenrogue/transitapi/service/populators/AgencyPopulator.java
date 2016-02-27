package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.Agency;
import com.lodenrogue.transitapi.persistance.Database;

public class AgencyPopulator extends Populator<Agency> {

	public AgencyPopulator(Database database) {
		super(database);
	}

	@Override
	protected Agency build() {
		Agency agency = new Agency();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) row.set(i, "");

			if (headers[i].equals("agency_id")) agency.setAgencyId(row.get(i));
			else if (headers[i].equals("agency_name")) agency.setName(row.get(i));
			else if (headers[i].equals("agency_url")) agency.setUrl(row.get(i));
			else if (headers[i].equals("agency_timezone")) agency.setTimezone(row.get(i));
			else if (headers[i].equals("agency_lang")) agency.setLanguage(row.get(i));
			else if (headers[i].equals("agency_phone")) agency.setPhone(row.get(i));
			else if (headers[i].equals("agency_fare_url")) agency.setFareUrl(row.get(i));
			else if (headers[i].equals("agency_email")) agency.setEmail(row.get(i));
		}
		return agency;
	}

}
