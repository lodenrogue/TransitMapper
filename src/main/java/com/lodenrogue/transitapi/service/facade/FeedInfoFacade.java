package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.FeedInfo;
import com.lodenrogue.transitapi.service.Api;

public class FeedInfoFacade extends m_AbstractFacade<FeedInfo> {

	public FeedInfoFacade() {
		super(FeedInfo.class);
	}

	@Override
	public String getApiUrl() {
		return Api.FEED_INFO_URL;
	}

}
