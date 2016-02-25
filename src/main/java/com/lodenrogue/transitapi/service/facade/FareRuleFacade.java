package com.lodenrogue.transitapi.service.facade;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.FareRule;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

public class FareRuleFacade extends m_AbstractFacade<FareRule> {

	public FareRuleFacade() {
		super(FareRule.class);
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Integer> results = getSession().createQuery("SELECT fareRule.fareId FROM FareRule fareRule").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (int r : results) {
			resources.add(new Resource(r + "", Api.FARE_RULES_URL + "/" + r));
		}
		return resources;
	}

}
