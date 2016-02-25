package com.lodenrogue.transitapi.service;

public class Resource {
	private String name;
	private String url;

	public Resource(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

}
