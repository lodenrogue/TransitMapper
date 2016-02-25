package com.lodenrogue.transitapi.model;

public class FareRule {
	private int id;
	private String routeId;
	private String fareId;
	private String originId;
	private String destinationId;
	private String containsId;

	public FareRule() {
		routeId = "";
		originId = "";
		destinationId = "";
		containsId = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getFareId() {
		return fareId;
	}

	public void setFareId(String fareId) {
		this.fareId = fareId;
	}

	public String getOriginId() {
		return originId;
	}

	public void setOriginId(String originId) {
		this.originId = originId;
	}

	public String getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	public String getContainsId() {
		return containsId;
	}

	public void setContainsId(String containsId) {
		this.containsId = containsId;
	}

}
