package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.ServiceDate;
import com.lodenrogue.transitapi.persistance.Database;

public class ServiceDatesPopulator extends Populator<ServiceDate> {

	public ServiceDatesPopulator(Database database) {
		super(database);
	}

	@Override
	protected ServiceDate build() {
		ServiceDate serviceDate = new ServiceDate();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("service_id")) {
				serviceDate.setServiceId(row.get(i));
			}
			else if (headers[i].equals("date")) {
				serviceDate.setDate(PopulatorUtils.parseDate(row.get(i)));
			}
			else if (headers[i].equals("exception_type")) {
				serviceDate.setExceptionType(Integer.parseInt(row.get(i)));
			}
		}
		return serviceDate;
	}

}
