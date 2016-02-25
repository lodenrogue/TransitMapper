package com.lodenrogue.transitapi.service.rest;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.FeedInfo;

public class FeedInfoFacade extends m_AbstractFacade<FeedInfo> {

	public FeedInfoFacade() {
		super(FeedInfo.class);
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Integer> results = getSession().createQuery("SELECT feedInfo.id FROM FeedInfo feedInfo").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (int r : results) {
			resources.add(new Resource(r + "", Api.FEED_INFO_URL + "/" + r));
		}
		return resources;
	}

}
