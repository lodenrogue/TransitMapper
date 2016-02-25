package com.lodenrogue.transitapi.model;

public class Trip {
	private String tripId;
	private String routeId;
	private String serviceId;
	private String headsign;
	private String shortName;
	private int directionId; // default value is set to 0 if this field is
	// blank
	private String blockId;
	private String shapeId;
	private int wheelchairAccessible;
	private int bikesAllowed;

	public Trip() {
		headsign = "";
		shortName = "";
		blockId = "";
		shapeId = "";
		wheelchairAccessible = 0;
		bikesAllowed = 0;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getHeadsign() {
		return headsign;
	}

	public void setHeadsign(String headsign) {
		this.headsign = headsign;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getDirectionId() {
		return directionId;
	}

	public void setDirectionId(int directionId) {
		this.directionId = directionId;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getShapeId() {
		return shapeId;
	}

	public void setShapeId(String shapeId) {
		this.shapeId = shapeId;
	}

	public int getWheelchairAccessible() {
		return wheelchairAccessible;
	}

	public void setWheelchairAccessible(int wheelchairAccessible) {
		this.wheelchairAccessible = wheelchairAccessible;
	}

	public int getBikesAllowed() {
		return bikesAllowed;
	}

	public void setBikesAllowed(int bikesAllowed) {
		this.bikesAllowed = bikesAllowed;
	}
}
