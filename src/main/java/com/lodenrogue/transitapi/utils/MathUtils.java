package com.lodenrogue.transitapi.utils;

public class MathUtils {

	private MathUtils() {

	}

	public static int parseInt(String value, int defaultValue) {
		try {
			return Integer.parseInt(value);
		}
		catch (NumberFormatException ex) {
			return defaultValue;
		}
	}

	public static float parseFloat(String value, float defaultValue) {
		try {
			return Float.parseFloat(value);
		}
		catch (NumberFormatException ex) {
			return defaultValue;
		}
	}

	public static double toMiles(double meters) {
		return meters * 0.00062137;
	}

	/**
	 * @param lat1
	 * @param lon1
	 * @param lat2
	 * @param lon2
	 * @return distance between two latitude and longitude points in meters.
	 */
	public static float getDistance(float lat1, float lon1, float lat2, float lon2) {
		float earthRadius = 6371000f; // in meters

		float lat1Radians = (float) Math.toRadians(lat1);
		float lat2Radians = (float) Math.toRadians(lat2);
		float latDistance = (float) Math.toRadians(lat2 - lat1);
		float lonDistance = (float) Math.toRadians(lon2 - lon1);

		//@formatter:off
		float a = (float) (Math.sin(latDistance/2) * Math.sin(latDistance/2) +
				   Math.cos(lat1Radians) * Math.cos(lat2Radians) *
				   Math.sin(lonDistance/2) * Math.sin(lonDistance/2));
		//@formatter:on

		float c = (float) (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)));
		float distance = earthRadius * c;

		return distance;
	}

}
