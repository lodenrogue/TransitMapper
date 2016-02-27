package com.lodenrogue.transitapi.service.populators;

import java.math.BigDecimal;

import com.lodenrogue.transitapi.model.Shape;
import com.lodenrogue.transitapi.persistance.Database;
import com.lodenrogue.transitapi.utils.MathUtils;

public class ShapesPopulator extends Populator<Shape> {

	public ShapesPopulator(Database database) {
		super(database);
	}

	@Override
	protected Shape build() {
		Shape shape = new Shape();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("shape_id")) {
				shape.setShapeId(row.get(i));
			}
			else if (headers[i].equals("shape_pt_lat")) {
				shape.setPointLat(new BigDecimal(row.get(i)));
			}
			else if (headers[i].equals("shape_pt_lon")) {
				shape.setPointLon(new BigDecimal(row.get(i)));
			}
			else if (headers[i].equals("shape_pt_sequence")) {
				shape.setPointSequence(Integer.parseInt(row.get(i)));
			}
			else if (headers[i].equals("shape_dist_traveled")) {
				shape.setDistanceTraveled(new BigDecimal(MathUtils.parseFloat(row.get(i), 0.0f)));
			}
		}
		return shape;
	}

}
