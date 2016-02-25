package com.lodenrogue.transitapi.service.rest;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.StopTime;

public class StopTimeFacade extends m_AbstractFacade<StopTime> {

	public StopTimeFacade() {
		super(StopTime.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Integer> results = getSession().createQuery("SELECT stopTime.id FROM StopTime stopTime").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (int r : results) {
			resources.add(new Resource(r + "", Api.STOP_TIMES_URL + "/" + r));
		}
		return resources;
	}

}
