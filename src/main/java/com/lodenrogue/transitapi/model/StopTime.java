package com.lodenrogue.transitapi.model;

import java.math.BigDecimal;

public class StopTime {
	private int id;
	private String tripId;
	private String arrivalTime;
	private String departureTime;
	private String stopId;
	private int stopSequence;
	private String stopHeadsign;
	private int pickupType;
	private int dropOffType;
	private BigDecimal shapeDistTraveled;
	private int timepoint;

	public StopTime() {
		stopHeadsign = "";
		pickupType = 0;
		dropOffType = 0;
		shapeDistTraveled = new BigDecimal(0.0f);
		timepoint = 1;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public int getStopSequence() {
		return stopSequence;
	}

	public void setStopSequence(int stopSequence) {
		this.stopSequence = stopSequence;
	}

	public String getStopHeadsign() {
		return stopHeadsign;
	}

	public void setStopHeadsign(String stopHeadsign) {
		this.stopHeadsign = stopHeadsign;
	}

	public int getPickupType() {
		return pickupType;
	}

	public void setPickupType(int pickupType) {
		this.pickupType = pickupType;
	}

	public int getDropOffType() {
		return dropOffType;
	}

	public void setDropOffType(int dropOffType) {
		this.dropOffType = dropOffType;
	}

	public BigDecimal getShapeDistTraveled() {
		return shapeDistTraveled;
	}

	public void setShapeDistTraveled(BigDecimal shapeDistTraveled) {
		this.shapeDistTraveled = shapeDistTraveled;
	}

	public int getTimepoint() {
		return timepoint;
	}

	public void setTimepoint(int timepoint) {
		this.timepoint = timepoint;
	}

}
