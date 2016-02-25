package com.lodenrogue.transitapi.service.facade;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Agency;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

public class AgencyFacade extends m_AbstractFacade<Agency> {

	public AgencyFacade() {
		super(Agency.class);
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Object[]> results = getSession().createQuery("SELECT agency.name, agency.id FROM Agency agency").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (Object[] result : results) {
			resources.add(new Resource(result[0] + "", Api.AGENCY_URL + "/" + result[1]));
		}
		return resources;
	}

}
