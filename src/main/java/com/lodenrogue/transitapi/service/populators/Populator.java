package com.lodenrogue.transitapi.service.populators;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.supercsv.io.CsvListReader;
import org.supercsv.prefs.CsvPreference;

import com.lodenrogue.transitapi.model.Database;

abstract class Populator<T> {
	protected String[] headers;
	protected List<String> row;
	protected Session session;
	private Database database;

	public Populator(Database database) {
		this.database = database;
	}

	protected abstract T build();

	public void populate(File file) throws IOException {
		CsvListReader listReader = new CsvListReader(new FileReader(file), CsvPreference.STANDARD_PREFERENCE);
		headers = listReader.getHeader(true);
		row = null;

		session = database.getSessionFactory().openSession();
		session.beginTransaction();
		int batchNum = 0;
		while ((row = listReader.read()) != null) {
			session.save(build());
			batchNum++;
			if (batchNum == 1000) {
				session.getTransaction().commit();
				session.clear();
				session.beginTransaction();
				batchNum = 0;
			}
		}
		session.getTransaction().commit();
		session.close();
		listReader.close();
	}

	public void populate(String pathName) throws IOException {
		populate(new File(pathName));
	}

}
