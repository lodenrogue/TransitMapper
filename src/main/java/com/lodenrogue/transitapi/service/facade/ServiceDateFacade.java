package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.ServiceDate;
import com.lodenrogue.transitapi.service.Api;

public class ServiceDateFacade extends m_AbstractFacade<ServiceDate> {

	public ServiceDateFacade() {
		super(ServiceDate.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getApiUrl() {
		return Api.SERVICE_DATES_URL;
	}

}
