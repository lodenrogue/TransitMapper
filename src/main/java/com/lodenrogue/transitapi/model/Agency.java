package com.lodenrogue.transitapi.model;

public class Agency {
	private int id;
	private String agencyId;
	private String name;
	private String url;
	private String timezone;
	private String language;
	private String phone;
	private String fareUrl;
	private String email;

	public Agency() {
		agencyId = "";
		language = "";
		phone = "";
		fareUrl = "";
		email = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String id) {
		this.agencyId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFareUrl() {
		return fareUrl;
	}

	public void setFareUrl(String fareUrl) {
		this.fareUrl = fareUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
