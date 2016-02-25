package com.lodenrogue.transitapi.model;

import java.math.BigDecimal;

public class Stop {
	private String stopId;
	private String code;
	private String name;
	private String description;
	private BigDecimal lat;
	private BigDecimal lon;
	private String zoneId;
	private String url;
	private int locationType;
	private String parentStation;
	private String timezone;
	private int wheelchairBoarding;

	public Stop() {
		code = "";
		description = "";
		zoneId = "";
		url = "";
		locationType = 0;
		timezone = "";
		wheelchairBoarding = 0;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLon() {
		return lon;
	}

	public void setLon(BigDecimal lon) {
		this.lon = lon;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int isLocationType() {
		return locationType;
	}

	public void setLocationType(int locationType) {
		this.locationType = locationType;
	}

	public String getParentStation() {
		return parentStation;
	}

	public void setParentStation(String parentStation) {
		this.parentStation = parentStation;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getWheelchairBoarding() {
		return wheelchairBoarding;
	}

	public void setWheelchairBoarding(int wheelchairBoarding) {
		this.wheelchairBoarding = wheelchairBoarding;
	}
}
