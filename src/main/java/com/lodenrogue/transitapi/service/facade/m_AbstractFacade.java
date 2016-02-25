package com.lodenrogue.transitapi.service.facade;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import com.lodenrogue.transitapi.model.Database;
import com.lodenrogue.transitapi.service.Response;

public abstract class m_AbstractFacade<T> {
	private Class<T> entityClass;
	private Session session;

	public m_AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@SuppressWarnings("rawtypes")
	public Response findAll() {
		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();

		Response response = new Response(session.createCriteria(entityClass).list());
		response.setTotal(((List) response.getData()).size());
		response.setCount(response.getTotal());

		session.getTransaction().commit();
		session.close();

		return response;
	}

	public Response findRange(int page, int size) {
		if (page < 0 || size <= 0) {
			return new Response(null);
		}

		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<T> list = session.createCriteria(entityClass).setFirstResult(page * size).setMaxResults(size).list();
		Response response = new Response(list);

		long total = (Long) session.createCriteria(entityClass).setProjection(Projections.rowCount()).uniqueResult();
		response.setTotal(total);
		response.setCount(list.size());

		if (list.size() > 0 && page > 0) {
			response.setPrevPage(getApiUrl() + "?page=" + (page - 1) + "&size=" + size);
		}

		if (total > (page * size) + size) {
			response.setNextPage(getApiUrl() + "?page=" + (page + 1) + "&size=" + size);
		}

		session.getTransaction().commit();
		session.close();
		return response;

	}

	public abstract String getApiUrl();

	public Response find(Serializable id) {
		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();

		Response response = new Response(session.get(entityClass, id));
		if (response.getData() == null) {
			response.setTotal(0);
			response.setCount(0);
		}
		else {
			response.setTotal(1);
			response.setCount(1);
		}

		session.getTransaction().commit();
		session.close();
		return response;
	}

	protected Class<T> getEntityClass() {
		return entityClass;
	}

	protected Session getSession() {
		return session;
	}
}
