package com.lodenrogue.transitapi.model;

public class Frequency {
	private int id;
	private String tripId;
	private String startTime;
	private String endTime;
	private int headwaySecs;
	private int exactTimes;

	public Frequency() {
		exactTimes = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getHeadwaySecs() {
		return headwaySecs;
	}

	public void setHeadwaySecs(int headwaySecs) {
		this.headwaySecs = headwaySecs;
	}

	public int getExactTimes() {
		return exactTimes;
	}

	public void setExactTimes(int exactTimes) {
		this.exactTimes = exactTimes;
	}
}
