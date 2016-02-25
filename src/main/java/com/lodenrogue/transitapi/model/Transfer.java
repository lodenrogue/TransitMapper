package com.lodenrogue.transitapi.model;

public class Transfer {
	private int id;
	private String fromStopId;
	private String toStopId;
	private int transferType;
	private int minTransferTime;

	public Transfer() {
		minTransferTime = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromStopId() {
		return fromStopId;
	}

	public void setFromStopId(String fromStopId) {
		this.fromStopId = fromStopId;
	}

	public String getToStopId() {
		return toStopId;
	}

	public void setToStopId(String toStopId) {
		this.toStopId = toStopId;
	}

	public int getTransferType() {
		return transferType;
	}

	public void setTransferType(int transferType) {
		this.transferType = transferType;
	}

	public int getMinTransferTime() {
		return minTransferTime;
	}

	public void setMinTransferTime(int minTransferTime) {
		this.minTransferTime = minTransferTime;
	}
}
