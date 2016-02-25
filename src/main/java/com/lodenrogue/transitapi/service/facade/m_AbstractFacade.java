package com.lodenrogue.transitapi.service.facade;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import com.lodenrogue.transitapi.model.Database;
import com.lodenrogue.transitapi.service.Api;
import com.lodenrogue.transitapi.service.Resource;

public abstract class m_AbstractFacade<T> {
	private Class<T> entityClass;
	private Session session;

	public m_AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@SuppressWarnings("unchecked")
	public Object findAll() {
		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();
		long count = (Long) session.createCriteria(entityClass).setProjection(Projections.rowCount())
				.uniqueResult();

		List<Resource> resources = null;
		if (count > Api.MAX_RESULT_SIZE) {
			resources = buildResourceList();
		}
		else {
			resources = session.createCriteria(entityClass).list();
		}
		session.getTransaction().commit();
		session.close();

		return resources;
	}

	protected abstract List<Resource> buildResourceList();

	public T find(Serializable id) {
		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();
		T t = (T) session.get(entityClass, id);
		session.getTransaction().commit();
		session.close();
		return t;
	}

	protected Class<T> getEntityClass() {
		return entityClass;
	}

	protected Session getSession() {
		return session;
	}
}
