package com.lodenrogue.transitapi.service;

import java.util.List;

public class Response {
	private int status;
	private long total;
	private long count;
	private String prevPage;
	private String nextPage;
	private Object data;

	public Response(Object data) {
		this.data = data;
		status = getCode(data);
		setNextPage("");
		setPrevPage("");
	}

	public int getStatus() {
		return status;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Object getData() {
		return data;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public String getNextPage() {
		return nextPage;
	}

	public void setPrevPage(String prevPage) {
		this.prevPage = prevPage;
	}

	public String getPrevPage() {
		return prevPage;
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
