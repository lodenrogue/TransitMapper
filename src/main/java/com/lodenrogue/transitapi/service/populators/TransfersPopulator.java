package com.lodenrogue.transitapi.service.populators;

import com.lodenrogue.transitapi.model.Database;
import com.lodenrogue.transitapi.model.Transfer;
import com.lodenrogue.transitapi.utils.MathUtils;

public class TransfersPopulator extends Populator<Transfer> {

	public TransfersPopulator(Database database) {
		super(database);
	}

	@Override
	protected Transfer build() {
		Transfer transfer = new Transfer();
		for (int i = 0; i < headers.length; i++) {
			if (row.get(i) == null) {
				row.set(i, "");
			}

			if (headers[i].equals("from_stop_id")) {
				transfer.setFromStopId(row.get(i));
			}
			else if (headers[i].equals("to_stop_id")) {
				transfer.setToStopId(row.get(i));
			}
			else if (headers[i].equals("transfer_type")) {
				transfer.setTransferType(MathUtils.parseInt(row.get(i), 0));
			}
			else if (headers[i].equals("min_transfer_time")) {
				transfer.setTransferType(MathUtils.parseInt(row.get(i), 0));
			}
		}
		return transfer;
	}

}
