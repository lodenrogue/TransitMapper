package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.StopTime;
import com.lodenrogue.transitapi.service.Api;

public class StopTimeFacade extends m_AbstractFacade<StopTime> {

	public StopTimeFacade() {
		super(StopTime.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getApiUrl() {
		return Api.STOP_TIMES_URL;
	}

}
