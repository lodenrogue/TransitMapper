package com.lodenrogue.transitapi.service.rest;

import java.util.List;

public class RestResponse {
	private int status;
	private Object data;

	public RestResponse(Object data) {
		this.data = data;
		status = getCode(data);
	}

	public int getStatus() {
		return status;
	}

	public Object getData() {
		return data;
	}

	private int getCode(Object data) {
		if (data instanceof List) {
			
			@SuppressWarnings("rawtypes")
			List d = (List) data;
			if (d.size() == 0) {
				return 404;
			}
		}

		return data == null ? 404 : 200;
	}

}
