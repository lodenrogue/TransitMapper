package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Fare;
import com.lodenrogue.transitapi.service.Api;

public class FareFacade extends m_AbstractFacade<Fare> {

	public FareFacade() {
		super(Fare.class);
	}

	@Override
	public String getApiUrl() {
		return Api.FARE_ATTRIBUTES_URL;
	}

}
