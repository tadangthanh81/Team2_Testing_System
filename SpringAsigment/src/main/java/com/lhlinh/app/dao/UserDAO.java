package com.lhlinh.app.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import com.lhlinh.app.entities.User;


@Repository
public class UserDAO {
	private  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@SuppressWarnings("unchecked")
	public List<User> getListUser() {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		List<User> listUser = null;
		try {
			transaction = session.beginTransaction();
			listUser = session.createQuery("from users").list();
			transaction.commit();
		} catch (HibernateException ex) {
			if (transaction != null)
				transaction.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return listUser;
	}
	// GET ACCOUNT BY ID
		public User getAnUserById(int userId) {
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
			User user = null;
			try {
				transaction = session.beginTransaction();
				user = session.get(User.class, userId);
				transaction.commit();
			} catch (HibernateException ex) {
				if (transaction != null)
					transaction.rollback();
				ex.printStackTrace();
			} finally {
				session.close();
			}
			return user;
		}

		public  boolean insertUsert(User user) {
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				session.save(user);
				transaction.commit();
			} catch (HibernateException ex) {
				if (transaction != null)
					transaction.rollback();
				ex.printStackTrace();
				return false;
			} finally {
				session.close();
			}
			return true;
		}

		public boolean deleteUser(int userId) {
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
				User user = (User) session.get(User.class, userId);
				session.delete(user);
				transaction.commit();
			} catch (HibernateException ex) {
				if (transaction != null)
					transaction.rollback();
				ex.printStackTrace();
				return false;
			} finally {
				session.close();
			}
			return true;
		}




}
