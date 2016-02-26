package com.lodenrogue.transitapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;
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
import com.lodenrogue.transitapi.service.facade.m_AbstractFacade;

@RestController
public class RestApiController {

	@RequestMapping(path = Api.BASE_URL, method = RequestMethod.GET)
	public Response getResources() {
		List<Resource> resources = new ArrayList<Resource>();
		resources.add(new Resource("agency", Api.AGENCY_URL));
		resources.add(new Resource("calendar", Api.SERVICE_CALENDAR_URL));
		resources.add(new Resource("calendar-dates", Api.SERVICE_DATES_URL));
		resources.add(new Resource("fare-attributes", Api.FARE_ATTRIBUTES_URL));
		resources.add(new Resource("fare-rules", Api.FARE_RULES_URL));
		resources.add(new Resource("feed-info", Api.FEED_INFO_URL));
		resources.add(new Resource("frequencies", Api.FREQUENCIES_URL));
		resources.add(new Resource("routes", Api.ROUTES_URL));
		resources.add(new Resource("shapes", Api.SHAPES_URL));
		resources.add(new Resource("stops", Api.STOPS_URL));
		resources.add(new Resource("stop-times", Api.STOP_TIMES_URL));
		resources.add(new Resource("transfers", Api.TRANSFERS_URL));
		resources.add(new Resource("trips", Api.TRIPS_URL));

		Response response = new Response(resources);
		response.setTotal(resources.size());
		response.setCount(resources.size());
		return response;
	}

	@RequestMapping(path = Api.AGENCY_URL, method = RequestMethod.GET)
	public Response getAgencies() {
		return getAgencies(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.AGENCY_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getAgencies(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new AgencyFacade(), page, size);
	}

	@RequestMapping(path = Api.AGENCY_URL + "/{id}", method = RequestMethod.GET)
	public Response getAgency(@PathVariable int id) {
		return buildUniqueResponse(new AgencyFacade().find(id));
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL, method = RequestMethod.GET)
	public Response getServiceCalendars() {
		return getServiceCalendars(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getServiceCalendars(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new ServiceCalendarFacade(), page, size);
	}

	@RequestMapping(path = Api.SERVICE_CALENDAR_URL + "/{id}", method = RequestMethod.GET)
	public Response getServiceCalendar(@PathVariable String id) {
		return buildUniqueResponse(new ServiceCalendarFacade().find(id));
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL, method = RequestMethod.GET)
	public Response getServiceDates() {
		return getServiceDates(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getServiceDates(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new ServiceDateFacade(), page, size);
	}

	@RequestMapping(path = Api.SERVICE_DATES_URL + "/{id}", method = RequestMethod.GET)
	public Response getServiceDate(@PathVariable int id) {
		return buildUniqueResponse(new ServiceDateFacade().find(id));
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL, method = RequestMethod.GET)
	public Response getFares() {
		return getFares(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFares(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new FareFacade(), page, size);
	}

	@RequestMapping(path = Api.FARE_ATTRIBUTES_URL + "/{id}", method = RequestMethod.GET)
	public Response getFare(@PathVariable String id) {
		return buildUniqueResponse(new FareFacade().find(id));
	}

	@RequestMapping(path = Api.FARE_RULES_URL, method = RequestMethod.GET)
	public Response getFareRules() {
		return getFareRules(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FARE_RULES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFareRules(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new FareRuleFacade(), page, size);
	}

	@RequestMapping(path = Api.FARE_RULES_URL + "/{id}", method = RequestMethod.GET)
	public Response getFareRule(@PathVariable int id) {
		return buildUniqueResponse(new FareRuleFacade().find(id));
	}

	@RequestMapping(path = Api.FEED_INFO_URL, method = RequestMethod.GET)
	public Response getFeedInfo() {
		return getFeedInfo(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FEED_INFO_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFeedInfo(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new FeedInfoFacade(), page, size);
	}

	@RequestMapping(path = Api.FEED_INFO_URL + "/{id}", method = RequestMethod.GET)
	public Response getFeedInfo(@PathVariable int id) {
		return buildUniqueResponse(new FeedInfoFacade().find(id));
	}

	@RequestMapping(path = Api.FREQUENCIES_URL, method = RequestMethod.GET)
	public Response getFrequencies() {
		return getFrequencies(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.FREQUENCIES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getFrequencies(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new FrequencyFacade(), page, size);
	}

	@RequestMapping(path = Api.FREQUENCIES_URL + "/{id}", method = RequestMethod.GET)
	public Response getFrequency(@PathVariable int id) {
		return buildUniqueResponse(new FrequencyFacade().find(id));
	}

	@RequestMapping(path = Api.ROUTES_URL, method = RequestMethod.GET)
	public Response getRoutes() {
		return getRoutes(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.ROUTES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getRoutes(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new RouteFacade(), page, size);
	}

	@RequestMapping(path = Api.ROUTES_URL + "/{id}", method = RequestMethod.GET)
	public Response getRoute(@PathVariable String id) {
		return buildUniqueResponse(new RouteFacade().find(id));
	}

	@RequestMapping(path = Api.SHAPES_URL, method = RequestMethod.GET)
	public Response getShapes() {
		return getShapes(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.SHAPES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getShapes(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new ShapeFacade(), page, size);
	}

	@RequestMapping(path = Api.SHAPES_URL + "/{id}", method = RequestMethod.GET)
	public Response getShape(@PathVariable int id) {
		return buildUniqueResponse(new ShapeFacade().find(id));
	}

	@RequestMapping(path = Api.STOPS_URL, method = RequestMethod.GET)
	public Response getStops() {
		return getStops(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.STOPS_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getStops(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new StopFacade(), page, size);
	}

	@RequestMapping(path = Api.STOPS_URL + "/{id}", method = RequestMethod.GET)
	public Response getStop(@PathVariable String id) {
		return buildUniqueResponse(new StopFacade().find(id));
	}

	@RequestMapping(path = Api.STOP_TIMES_URL, method = RequestMethod.GET)
	public Response getStopTimes() {
		return getStopTimes(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.STOP_TIMES_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getStopTimes(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new StopTimeFacade(), page, size);
	}

	@RequestMapping(path = Api.STOP_TIMES_URL + "/{id}", method = RequestMethod.GET)
	public Response getStopTime(@PathVariable int id) {
		return buildUniqueResponse(new StopTimeFacade().find(id));
	}

	@RequestMapping(path = Api.TRANSFERS_URL, method = RequestMethod.GET)
	public Response getTransfers() {
		return getTransfers(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.TRANSFERS_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getTransfers(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new TransferFacade(), page, size);
	}

	@RequestMapping(path = Api.TRANSFERS_URL + "/{id}", method = RequestMethod.GET)
	public Response getTransfer(@PathVariable int id) {
		return buildUniqueResponse(new TransferFacade().find(id));
	}

	@RequestMapping(path = Api.TRIPS_URL, method = RequestMethod.GET)
	public Response getTrips() {
		return getTrips(0, Api.DEFAULT_RESULT_SIZE);
	}

	@RequestMapping(path = Api.TRIPS_URL, method = RequestMethod.GET, params = { "page", "size" })
	public Response getTrips(@RequestParam int page, @RequestParam(defaultValue = Api.DEFAULT_RESULT_SIZE + "") int size) {
		return buildPagedResponse(new TripFacade(), page, size);
	}

	@RequestMapping(path = Api.TRIPS_URL + "/{id}", method = RequestMethod.GET)
	public Response getTrip(@PathVariable String id) {
		return buildUniqueResponse(new TripFacade().find(id));
	}

	private Response buildPagedResponse(m_AbstractFacade<?> facade, int page, int size) {
		List<?> list = facade.findRange(page, size);
		Response response = new Response(list);

		long total = facade.getCount();
		response.setTotal(total);
		response.setCount(list.size());

		if (list.size() > 0 && page > 0) {
			response.setPrevPage(facade.getApiUrl() + "?page=" + (page - 1) + "&size=" + size);
		}

		if (total > (page * size) + size) {
			response.setNextPage(facade.getApiUrl() + "?page=" + (page + 1) + "&size=" + size);
		}
		return response;
	}

	private Response buildUniqueResponse(Object object) {
		Response response = new Response(object);
		if (response.getData() == null) {
			response.setTotal(0);
			response.setCount(0);
		}
		else {
			response.setTotal(1);
			response.setCount(1);
		}
		return response;
	}
}
