package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Frequency;
import com.lodenrogue.transitapi.service.Api;

public class FrequencyFacade extends m_AbstractFacade<Frequency> {

	public FrequencyFacade() {
		super(Frequency.class);
	}

	@Override
	public String getApiUrl() {
		return Api.FREQUENCIES_URL;
	}

}
