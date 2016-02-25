package com.lodenrogue.transitapi.service.facade;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Route;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

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
