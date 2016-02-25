package com.lodenrogue.transitapi.service.rest;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.ServiceCalendar;

public class ServiceCalendarFacade extends m_AbstractFacade<ServiceCalendar> {

	public ServiceCalendarFacade() {
		super(ServiceCalendar.class);
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<String> results = getSession()
				.createQuery("SELECT serviceCalendar.serviceId FROM ServiceCalendar serviceCalendar").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (String r : results) {
			resources.add(new Resource(r, Api.SERVICE_CALENDAR_URL + "/" + r));
		}
		return resources;
	}

}
