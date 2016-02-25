package com.lodenrogue.transitapi.service.facade;

import com.lodenrogue.transitapi.model.Shape;
import com.lodenrogue.transitapi.service.Api;

public class ShapeFacade extends m_AbstractFacade<Shape> {

	public ShapeFacade() {
		super(Shape.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getApiUrl() {
		return Api.SHAPES_URL;
	}

}
