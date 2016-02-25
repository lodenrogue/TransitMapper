package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Trip;
import com.lodenrogue.transitapi.service.Api;

public class TripFacade extends m_AbstractFacade<Trip> {

	public TripFacade() {
		super(Trip.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getApiUrl() {
		return Api.TRIPS_URL;
	}

}
