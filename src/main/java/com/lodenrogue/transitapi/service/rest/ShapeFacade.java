package com.lodenrogue.transitapi.service.rest;

import java.util.ArrayList;
import java.util.List;

import com.lodenrogue.transitapi.model.Shape;

public class ShapeFacade extends m_AbstractFacade<Shape> {

	public ShapeFacade() {
		super(Shape.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Resource> buildResourceList() {
		@SuppressWarnings("unchecked")
		List<Integer> results = getSession().createQuery("SELECT shape.id FROM Shape shape").list();
		List<Resource> resources = new ArrayList<Resource>();
		for (int r : results) {
			resources.add(new Resource(r + "", Api.SHAPES_URL + "/" + r));
		}
		return resources;
	}

}
