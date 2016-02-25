package com.lodenrogue.transitapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Response;
import com.lodenrogue.transitapi.service.facade.AgencyFacade;
import com.lodenrogue.transitapi.service.facade.FareFacade;
import com.lodenrogue.transitapi.service.facade.FareRuleFacade;
import com.lodenrogue.transitapi.service.facade.FeedInfoFacade;
import com.lodenrogue.transitapi.service.facade.FrequencyFacade;
import com.lodenrogue.transitapi.service.facade.RouteFacade;
import com.lodenrogue.transitapi.service.facade.ServiceCalendarFacade;
import com.lodenrogue.transitapi.service.facade.ServiceDateFacade;
import com.lodenrogue.transitapi.service.facade.ShapeFacade;
import com.lodenrogue.transitapi.service.facade.StopFacade;
import com.lodenrogue.transitapi.service.facade.StopTimeFacade;
import com.lodenrogue.transitapi.service.facade.TransferFacade;
import com.lodenrogue.transitapi.service.facade.TripFacade;

@RestController
public class RestApiController {

	@RequestMapping(path = Api.AGENCY_URL, method = RequestMethod.GET)
	public Response getAgencies() {
		return getAgencies(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.AGENCY_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getAgencies(@RequestParam int page, @RequestParam int size) {
		return new AgencyFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.AGENCY_URL + "/{id}", method = RequestMethod.GET)
	public Response getAgency(@PathVariable int id) {
		return new AgencyFacade().find(id);
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL, method = RequestMethod.GET)
	public Response getServiceCalendars() {
		return getServiceCalendars(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getServiceCalendars(@RequestParam int page, @RequestParam int size) {
		return new ServiceCalendarFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL + "/{id}", method = RequestMethod.GET)
	public Response getServiceCalendar(@PathVariable String id) {
		return new ServiceCalendarFacade().find(id);
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL, method = RequestMethod.GET)
	public Response getServiceDates() {
		return getServiceDates(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getServiceDates(@RequestParam int page, @RequestParam int size) {
		return new ServiceDateFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL + "/{id}", method = RequestMethod.GET)
	public Response getServiceDate(@PathVariable int id) {
		return new ServiceDateFacade().find(id);
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL, method = RequestMethod.GET)
	public Response getFares() {
		return getFares(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFares(@RequestParam int page, @RequestParam int size) {
		return new FareFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL + "/{id}", method = RequestMethod.GET)
	public Response getFare(@PathVariable String id) {
		return new FareFacade().find(id);
	}

	@RequestMapping(path = Api.FARE_RULES_URL, method = RequestMethod.GET)
	public Response getFareRules() {
		return getFareRules(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FARE_RULES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFareRules(@RequestParam int page, @RequestParam int size) {
		return new FareRuleFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.FARE_RULES_URL + "/{id}", method = RequestMethod.GET)
	public Response getFareRule(@PathVariable int id) {
		return new FareRuleFacade().find(id);
	}

	@RequestMapping(path = Api.FEED_INFO_URL, method = RequestMethod.GET)
	public Response getFeedInfo() {
		return getFeedInfo(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FEED_INFO_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFeedInfo(@RequestParam int page, @RequestParam int size) {
		return new FeedInfoFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.FEED_INFO_URL + "/{id}", method = RequestMethod.GET)
	public Response getFeedInfo(@PathVariable int id) {
		return new FeedInfoFacade().find(id);
	}

	@RequestMapping(path = Api.FREQUENCIES_URL, method = RequestMethod.GET)
	public Response getFrequencies() {
		return getFrequencies(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FREQUENCIES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFrequencies(@RequestParam int page, @RequestParam int size) {
		return new FrequencyFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.FREQUENCIES_URL + "/{id}", method = RequestMethod.GET)
	public Response getFrequency(@PathVariable int id) {
		return new FrequencyFacade().find(id);
	}

	@RequestMapping(path = Api.ROUTES_URL, method = RequestMethod.GET)
	public Response getRoutes() {
		return getRoutes(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.ROUTES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getRoutes(@RequestParam int page, @RequestParam int size) {
		return new RouteFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.ROUTES_URL + "/{id}", method = RequestMethod.GET)
	public Response getRoute(@PathVariable String id) {
		return new RouteFacade().find(id);
	}

	@RequestMapping(path = Api.SHAPES_URL, method = RequestMethod.GET)
	public Response getShapes() {
		return getShapes(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.SHAPES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getShapes(@RequestParam int page, @RequestParam int size) {
		return new ShapeFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.SHAPES_URL + "/{id}", method = RequestMethod.GET)
	public Response getShape(@PathVariable int id) {
		return new ShapeFacade().find(id);
	}

	@RequestMapping(path = Api.STOPS_URL, method = RequestMethod.GET)
	public Response getStops() {
		return getStops(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.STOPS_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getStops(@RequestParam int page, @RequestParam int size) {
		return new StopFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.STOPS_URL + "/{id}", method = RequestMethod.GET)
	public Response getStop(@PathVariable String id) {
		return new StopFacade().find(id);
	}

	@RequestMapping(path = Api.STOP_TIMES_URL, method = RequestMethod.GET)
	public Response getStopTimes() {
		return getStopTimes(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.STOP_TIMES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getStopTimes(@RequestParam int page, @RequestParam int size) {
		return new StopTimeFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.STOP_TIMES_URL + "/{id}", method = RequestMethod.GET)
	public Response getStopTime(@PathVariable int id) {
		return new StopTimeFacade().find(id);
	}

	@RequestMapping(path = Api.TRANSFERS_URL, method = RequestMethod.GET)
	public Response getTransfers() {
		return getTransfers(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.TRANSFERS_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getTransfers(@RequestParam int page, @RequestParam int size) {
		return new TransferFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.TRANSFERS_URL + "/{id}", method = RequestMethod.GET)
	public Response getTransfer(@PathVariable int id) {
		return new TransferFacade().find(id);
	}

	@RequestMapping(path = Api.TRIPS_URL, method = RequestMethod.GET)
	public Response getTrips() {
		return getTrips(0, Api.MAX_RESULT_SIZE);
	}

	@RequestMapping(path = Api.TRIPS_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getTrips(@RequestParam int page, @RequestParam int size) {
		return new TripFacade().findRange(page, size);
	}

	@RequestMapping(path = Api.TRIPS_URL + "/{id}", method = RequestMethod.GET)
	public Response getTrip(@PathVariable String id) {
		return new TripFacade().find(id);
	}

}
