package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.FareRule;
import com.lodenrogue.transitapi.service.Api;

public class FareRuleFacade extends m_AbstractFacade<FareRule> {

	public FareRuleFacade() {
		super(FareRule.class);
	}

	@Override
	public String getApiUrl() {
		return Api.FARE_RULES_URL;
	}

}
