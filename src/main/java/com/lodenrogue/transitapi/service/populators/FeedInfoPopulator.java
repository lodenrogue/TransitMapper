package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.FeedInfo;
import com.lodenrogue.transitapi.persistance.Database;

public class FeedInfoPopulator extends Populator<FeedInfo> {

	public FeedInfoPopulator(Database database) {
		super(database);
	}

	@Override
	protected FeedInfo build() {
		FeedInfo info = new FeedInfo();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("feed_publisher_name")) {
				info.setPublisherName(row.get(i));
			}
			else if (headers[i].equals("feed_publisher_url")) {
				info.setPublisherUrl(row.get(i));
			}
			else if (headers[i].equals("feed_lang")) {
				info.setLanguage(row.get(i));
			}
			else if (headers[i].equals("feed_start_date")) {
				info.setStartDate(PopulatorUtils.parseDate(row.get(i)));
			}
			else if (headers[i].equals("feed_end_date")) {
				info.setEndDate(PopulatorUtils.parseDate(row.get(i)));
			}
			else if (headers[i].equals("feed_version")) {
				info.setVersion(row.get(i));
			}
		}
		return info;
	}

}
