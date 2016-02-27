package com.lodenrogue.transitapi.service.facade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import com.lodenrogue.transitapi.persistance.Database;

public abstract class m_AbstractFacade<T> {
	private Class<T> entityClass;
	private Session session;

	public m_AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public List<T> findAll() {
		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<T> list = session.createCriteria(entityClass).list();

		session.getTransaction().commit();
		session.close();
		return list;
	}

	public List<T> findRange(int page, int size) {
		if (page < 0 || size <= 0) {
			return new ArrayList<T>();
		}

		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<T> list = session.createCriteria(entityClass).setFirstResult(page * size).setMaxResults(size).list();
		session.getTransaction().commit();
		session.close();
		return list;

	}

	public T find(Serializable id) {
		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();
		T t = session.get(entityClass, id);
		session.getTransaction().commit();
		session.close();
		return t;
	}

	public long getCount() {
		session = Database.getInstance().getSessionFactory().openSession();
		session.beginTransaction();
		long count = (Long) session.createCriteria(entityClass).setProjection(Projections.rowCount()).uniqueResult();
		session.getTransaction().commit();
		session.close();
		return count;
	}

	public abstract String getApiUrl();

	protected Class<T> getEntityClass() {
		return entityClass;
	}

	protected Session getSession() {
		return session;
	}
}
