package com.lodenrogue.transitapi.model;

import java.math.BigDecimal;

public class Fare {
	private String fareId;
	private BigDecimal price;
	private String currencyType;
	private int paymentMethod;

	// GTFS requires transfers and transferDuration fields
	// to have an empty value option so can't use int
	private String transfers;
	private String transferDuration;

	public Fare() {
		transferDuration = "";
	}

	public String getFareId() {
		return fareId;
	}

	public void setFareId(String fareId) {
		this.fareId = fareId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTransfers() {
		return transfers;
	}

	public void setTransfers(String transfers) {
		this.transfers = transfers;
	}

	public String getTransferDuration() {
		return transferDuration;
	}

	public void setTransferDuration(String transferDuration) {
		this.transferDuration = transferDuration;
	}

}
