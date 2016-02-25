package com.lodenrogue.transitapi.service.rest;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Stop;

public class StopFacade extends m_AbstractFacade<Stop> {

	public StopFacade() {
		super(Stop.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<String> results = getSession().createQuery("SELECT stop.stopId FROM Stop stop").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (String r : results) {
			resources.add(new Resource(r, Api.STOPS_URL + "/" + r));
		}
		return resources;
	}

}
