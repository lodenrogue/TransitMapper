package com.lodenrogue.transitapi.service.facade;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Transfer;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

public class TransferFacade extends m_AbstractFacade<Transfer> {

	public TransferFacade() {
		super(Transfer.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Integer> results = getSession().createQuery("SELECT transfer.id FROM Transfer transfer").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (int r : results) {
			resources.add(new Resource(r + "", Api.TRANSFERS_URL + "/" + r));
		}
		return resources;
	}

}
