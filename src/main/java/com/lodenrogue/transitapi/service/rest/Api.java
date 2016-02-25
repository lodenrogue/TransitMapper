package com.lodenrogue.transitapi.service.rest;

public class Api {

	private Api() {

	}

	public static final int MAX_RESULT_SIZE = 1000000;

	public static final String BASE_URL = "/api";

	public static final String AGENCY_URL = BASE_URL + "/agency";

	public static final String FARE_ATTRIBUTES_URL = BASE_URL + "/fare-attributes";

	public static final String FARE_RULES_URL = BASE_URL + "/fare-rules";

	public static final String FEED_INFO_URL = BASE_URL + "/feed-info";

	public static final String FREQUENCIES_URL = BASE_URL + "/frequencies";

	public static final String ROUTES_URL = BASE_URL + "/routes";

	public static final String SERVICE_CALENDAR_URL = BASE_URL + "/calendar";

	public static final String SERVICE_DATES_URL = BASE_URL + "/calendar-dates";

	public static final String SHAPES_URL = BASE_URL + "/shapes";

	public static final String STOPS_URL = BASE_URL + "/stops";

	public static final String STOP_TIMES_URL = BASE_URL + "/stop-times";

	public static final String TRANSFERS_URL = BASE_URL + "/transfers";

	public static final String TRIPS_URL = BASE_URL + "/trips";

}
