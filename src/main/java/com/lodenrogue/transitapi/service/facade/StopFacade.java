package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Stop;
import com.lodenrogue.transitapi.service.Api;

public class StopFacade extends m_AbstractFacade<Stop> {

	public StopFacade() {
		super(Stop.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getApiUrl() {
		return Api.STOPS_URL;
	}

}
