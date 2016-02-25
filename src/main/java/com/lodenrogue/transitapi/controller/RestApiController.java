package com.lodenrogue.transitapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lodenrogue.transitapi.service.rest.AgencyFacade;
import com.lodenrogue.transitapi.service.rest.Api;
import com.lodenrogue.transitapi.service.rest.FareFacade;
import com.lodenrogue.transitapi.service.rest.FareRuleFacade;
import com.lodenrogue.transitapi.service.rest.FeedInfoFacade;
import com.lodenrogue.transitapi.service.rest.FrequencyFacade;
import com.lodenrogue.transitapi.service.rest.RestResponse;
import com.lodenrogue.transitapi.service.rest.RouteFacade;
import com.lodenrogue.transitapi.service.rest.ServiceCalendarFacade;
import com.lodenrogue.transitapi.service.rest.ServiceDateFacade;
import com.lodenrogue.transitapi.service.rest.ShapeFacade;
import com.lodenrogue.transitapi.service.rest.StopFacade;
import com.lodenrogue.transitapi.service.rest.StopTimeFacade;
import com.lodenrogue.transitapi.service.rest.TransferFacade;
import com.lodenrogue.transitapi.service.rest.TripFacade;

@RestController
public class RestApiController {

	@RequestMapping(path = Api.AGENCY_URL, method = RequestMethod.GET)
	public RestResponse getAgencies() {
		return new RestResponse(new AgencyFacade().findAll());
	}

	@RequestMapping(path = Api.AGENCY_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getAgency(@PathVariable int id) {
		return new RestResponse(new AgencyFacade().find(id));
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL, method = RequestMethod.GET)
	public RestResponse getServiceCalendars() {
		return new RestResponse(new ServiceCalendarFacade().findAll());
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getServiceCalendar(@PathVariable String id) {
		return new RestResponse(new ServiceCalendarFacade().find(id));
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL, method = RequestMethod.GET)
	public RestResponse getServiceDates() {
		return new RestResponse(new ServiceDateFacade().findAll());
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getServiceDate(@PathVariable int id) {
		return new RestResponse(new ServiceDateFacade().find(id));
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL, method = RequestMethod.GET)
	public RestResponse getFares() {
		return new RestResponse(new FareFacade().findAll());
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getFare(@PathVariable String id) {
		return new RestResponse(new FareFacade().find(id));
	}

	@RequestMapping(path = Api.FARE_RULES_URL, method = RequestMethod.GET)
	public RestResponse getFareRules() {
		return new RestResponse(new FareRuleFacade().findAll());
	}

	@RequestMapping(path = Api.FARE_RULES_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getFareRule(@PathVariable int id) {
		return new RestResponse(new FareRuleFacade().find(id));
	}

	@RequestMapping(path = Api.FEED_INFO_URL, method = RequestMethod.GET)
	public RestResponse getFeedInfo() {
		return new RestResponse(new FeedInfoFacade().findAll());
	}

	@RequestMapping(path = Api.FEED_INFO_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getFeedInfo(@PathVariable int id) {
		return new RestResponse(new FeedInfoFacade().find(id));
	}

	@RequestMapping(path = Api.FREQUENCIES_URL, method = RequestMethod.GET)
	public RestResponse getFrequencies() {
		return new RestResponse(new FrequencyFacade().findAll());
	}

	@RequestMapping(path = Api.FREQUENCIES_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getFrequency(@PathVariable int id) {
		return new RestResponse(new FrequencyFacade().find(id));
	}

	@RequestMapping(path = Api.ROUTES_URL, method = RequestMethod.GET)
	public RestResponse getRoutes() {
		return new RestResponse(new RouteFacade().findAll());
	}

	@RequestMapping(path = Api.ROUTES_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getRoute(@PathVariable String id) {
		return new RestResponse(new RouteFacade().find(id));
	}

	@RequestMapping(path = Api.SHAPES_URL, method = RequestMethod.GET)
	public RestResponse getShapes() {
		return new RestResponse(new ShapeFacade().findAll());
	}

	@RequestMapping(path = Api.SHAPES_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getShape(@PathVariable int id) {
		return new RestResponse(new ShapeFacade().find(id));
	}

	@RequestMapping(path = Api.STOPS_URL, method = RequestMethod.GET)
	public RestResponse getStops() {
		return new RestResponse(new StopFacade().findAll());
	}

	@RequestMapping(path = Api.STOPS_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getStop(@PathVariable String id) {
		return new RestResponse(new StopFacade().find(id));
	}

	@RequestMapping(path = Api.STOP_TIMES_URL, method = RequestMethod.GET)
	public RestResponse getStopTimes() {
		return new RestResponse(new StopTimeFacade().findAll());
	}

	@RequestMapping(path = Api.STOP_TIMES_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getStopTime(@PathVariable int id) {
		return new RestResponse(new StopTimeFacade().find(id));
	}

	@RequestMapping(path = Api.TRANSFERS_URL, method = RequestMethod.GET)
	public RestResponse getTransfers() {
		return new RestResponse(new TransferFacade().findAll());
	}

	@RequestMapping(path = Api.TRANSFERS_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getTransfer(@PathVariable int id) {
		return new RestResponse(new StopTimeFacade().find(id));
	}

	@RequestMapping(path = Api.TRIPS_URL, method = RequestMethod.GET)
	public RestResponse getTrips() {
		return new RestResponse(new TripFacade().findAll());
	}

	@RequestMapping(path = Api.TRIPS_URL + "/{id}", method = RequestMethod.GET)
	public RestResponse getTrip(@PathVariable String id) {
		return new RestResponse(new TripFacade().find(id));
	}

}
