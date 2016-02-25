package com.lodenrogue.transitapi.model;

import java.math.BigDecimal;

public class Shape {
	private int id;
	private String shapeId;
	private BigDecimal pointLat;
	private BigDecimal pointLon;
	private int pointSequence;
	private BigDecimal distanceTraveled;

	public Shape() {
		distanceTraveled = new BigDecimal(0.0f);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShapeId() {
		return shapeId;
	}

	public void setShapeId(String shapeId) {
		this.shapeId = shapeId;
	}

	public BigDecimal getPointLat() {
		return pointLat;
	}

	public void setPointLat(BigDecimal pointLat) {
		this.pointLat = pointLat;
	}

	public BigDecimal getPointLon() {
		return pointLon;
	}

	public void setPointLon(BigDecimal pointLon) {
		this.pointLon = pointLon;
	}

	public int getPointSequence() {
		return pointSequence;
	}

	public void setPointSequence(int pointSequence) {
		this.pointSequence = pointSequence;
	}

	public BigDecimal getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(BigDecimal distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

}
