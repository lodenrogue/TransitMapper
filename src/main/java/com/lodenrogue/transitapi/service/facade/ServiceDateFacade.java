package com.lodenrogue.transitapi.service.facade;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.ServiceDate;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

public class ServiceDateFacade extends m_AbstractFacade<ServiceDate> {

	public ServiceDateFacade() {
		super(ServiceDate.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Integer> results = getSession().createQuery("SELECT serviceDate.id FROM ServiceDate serviceDate")
				.list();
		List<Resource> resources = new ArrayList<Resource>();
		for (int r : results) {
			resources.add(new Resource(r + "", Api.SERVICE_DATES_URL + "/" + r));
		}
		return resources;
	}

}
