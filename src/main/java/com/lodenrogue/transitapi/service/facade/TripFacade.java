package com.lodenrogue.transitapi.service.facade;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Trip;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

public class TripFacade extends m_AbstractFacade<Trip> {

	public TripFacade() {
		super(Trip.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<String> results = getSession().createQuery("SELECT trip.tripId FROM Trip trip").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (String r : results) {
			resources.add(new Resource(r, Api.TRIPS_URL + "/" + r));
		}
		return resources;
	}

}
