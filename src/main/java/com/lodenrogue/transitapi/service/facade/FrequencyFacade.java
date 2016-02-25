package com.lodenrogue.transitapi.service.facade;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Frequency;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

public class FrequencyFacade extends m_AbstractFacade<Frequency> {

	public FrequencyFacade() {
		super(Frequency.class);
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Integer> results = getSession().createQuery("SELECT frequency.id FROM Frequency frequency").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (int r : results) {
			resources.add(new Resource(r + "", Api.FREQUENCIES_URL + "/" + r));
		}
		return resources;
	}

}
