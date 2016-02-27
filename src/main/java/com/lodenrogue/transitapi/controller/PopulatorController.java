package com.lodenrogue.transitapi.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lodenrogue.transitapi.persistance.Database;
import com.lodenrogue.transitapi.service.populators.AgencyPopulator;
import com.lodenrogue.transitapi.service.populators.FaresPopulator;
import com.lodenrogue.transitapi.service.populators.FareRulesPopulator;
import com.lodenrogue.transitapi.service.populators.FeedInfoPopulator;
import com.lodenrogue.transitapi.service.populators.FrequenciesPopulator;
import com.lodenrogue.transitapi.service.populators.RoutesPopulator;
import com.lodenrogue.transitapi.service.populators.ServiceCalendarPopulator;
import com.lodenrogue.transitapi.service.populators.ServiceDatesPopulator;
import com.lodenrogue.transitapi.service.populators.ShapesPopulator;
import com.lodenrogue.transitapi.service.populators.StopsPopulator;
import com.lodenrogue.transitapi.service.populators.TransfersPopulator;
import com.lodenrogue.transitapi.service.populators.TripsPopulator;
import com.lodenrogue.transitapi.service.populators.StopTimesPopulator;

@Controller
public class PopulatorController {

	@RequestMapping(path = "/populate/{type}", method = RequestMethod.GET)
	public String populate(@PathVariable String type) throws IOException {

		if (type.toLowerCase().equals("agency")) {
			Resource resource = new ClassPathResource("transit-data/agency.txt");
			new AgencyPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("calendar-dates")) {
			Resource resource = new ClassPathResource("transit-data/calendar_dates.txt");
			new ServiceDatesPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("calendar")) {
			Resource resource = new ClassPathResource("transit-data/calendar.txt");
			new ServiceCalendarPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("fare-attributes")) {
			Resource resource = new ClassPathResource("transit-data/fare_attributes.txt");
			new FaresPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("fare-rules")) {
			Resource resource = new ClassPathResource("transit-data/fare_rules.txt");
			new FareRulesPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("feed-info")) {
			Resource resource = new ClassPathResource("transit-data/feed_info.txt");
			new FeedInfoPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("frequencies")) {
			Resource resource = new ClassPathResource("transit-data/frequencies.txt");
			new FrequenciesPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("routes")) {
			Resource resource = new ClassPathResource("transit-data/routes.txt");
			new RoutesPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("shapes")) {
			Resource resource = new ClassPathResource("transit-data/shapes.txt");
			new ShapesPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("stops")) {
			Resource resource = new ClassPathResource("transit-data/stops.txt");
			new StopsPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("stop-times")) {
			Resource resource = new ClassPathResource("transit-data/stop_times.txt");
			new StopTimesPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("transfers")) {
			Resource resource = new ClassPathResource("transit-data/transfers.txt");
			new TransfersPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		else if (type.toLowerCase().equals("trips")) {
			Resource resource = new ClassPathResource("transit-data/trips.txt");
			new TripsPopulator(Database.getInstance()).populate(new File(resource.getURI()));
		}
		return "populated";
	}

}
