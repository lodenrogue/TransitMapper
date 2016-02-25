package com.lodenrogue.transitapi.service.rest;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Route;

public class RouteFacade extends m_AbstractFacade<Route> {

	public RouteFacade() {
		super(Route.class);
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<String> results = getSession().createQuery("SELECT route.routeId FROM Route route").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (String r : results) {
			resources.add(new Resource(r, Api.ROUTES_URL + "/" + r));
		}
		return resources;
	}

}
