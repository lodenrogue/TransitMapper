package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Route;
import com.lodenrogue.transitapi.service.Api;

public class RouteFacade extends m_AbstractFacade<Route> {

	public RouteFacade() {
		super(Route.class);
	}

	@Override
	public String getApiUrl() {
		return Api.ROUTES_URL;
	}

}
