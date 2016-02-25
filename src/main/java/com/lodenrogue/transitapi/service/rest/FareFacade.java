package com.lodenrogue.transitapi.service.rest;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Fare;

public class FareFacade extends m_AbstractFacade<Fare> {

	public FareFacade() {
		super(Fare.class);
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<String> results = getSession().createQuery("SELECT fare.fareId FROM Fare fare").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (String r : results) {
			resources.add(new Resource(r, Api.FARE_ATTRIBUTES_URL + "/" + r));
		}
		return resources;
	}

}
