package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Agency;
import com.lodenrogue.transitapi.service.Api;

public class AgencyFacade extends m_AbstractFacade<Agency> {

	public AgencyFacade() {
		super(Agency.class);
	}

	@Override
	public String getApiUrl() {
		return Api.AGENCY_URL;
	}

}
