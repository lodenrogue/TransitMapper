package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Transfer;
import com.lodenrogue.transitapi.service.Api;

public class TransferFacade extends m_AbstractFacade<Transfer> {

	public TransferFacade() {
		super(Transfer.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getApiUrl() {
		return Api.TRANSFERS_URL;
	}

}
