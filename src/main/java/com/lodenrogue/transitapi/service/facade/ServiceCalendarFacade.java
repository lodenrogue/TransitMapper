package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.ServiceCalendar;
import com.lodenrogue.transitapi.service.Api;

public class ServiceCalendarFacade extends m_AbstractFacade<ServiceCalendar> {

	public ServiceCalendarFacade() {
		super(ServiceCalendar.class);
	}

	@Override
	public String getApiUrl() {
		return Api.SERVICE_CALENDAR_URL;
	}

}
