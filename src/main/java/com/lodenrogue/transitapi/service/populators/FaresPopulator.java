package com.lodenrogue.transitapi.service.populators;

import java.math.BigDecimal;

import com.lodenrogue.transitapi.model.Fare;
import com.lodenrogue.transitapi.persistance.Database;

public class FaresPopulator extends Populator<Fare> {

	public FaresPopulator(Database database) {
		super(database);
	}

	@Override
	protected Fare build() {
		Fare fare = new Fare();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("fare_id")) {
				fare.setFareId(row.get(i));
			}
			else if (headers[i].equals("price")) {
				fare.setPrice(new BigDecimal(row.get(i)));
			}
			else if (headers[i].equals("currency_type")) {
				fare.setCurrencyType(row.get(i));
			}
			else if (headers[i].equals("payment_method")) {
				fare.setPaymentMethod(Integer.parseInt(row.get(i)));
			}
			else if (headers[i].equals("transfers")) {
				fare.setTransfers(row.get(i));
			}
			else if (headers[i].equals("transfer_duration")) {
				fare.setTransferDuration(row.get(i));
			}
		}
		return fare;
	}

}
