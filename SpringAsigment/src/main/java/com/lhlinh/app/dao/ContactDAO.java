package com.lhlinh.app.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.lhlinh.app.entities.Contact;
import com.lhlinh.app.entities.User;

@Repository
public class ContactDAO {
	private  SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@SuppressWarnings("unchecked")
	public List<Contact> getListContact() {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		List<Contact> listContact = null;
		try {
			transaction = session.beginTransaction();
			listContact = session.createQuery("from contact").list();
			transaction.commit();
		} catch (HibernateException ex) {
			if (transaction != null)
				transaction.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return listContact;
	}
	
	// GET COntact BY ID
			public Contact getContactById(int id) {
				Session session = sessionFactory.openSession();
				Transaction transaction = null;
				Contact contact = null;
				try {
					transaction = session.beginTransaction();
					contact = session.get(Contact.class, id);
					transaction.commit();
				} catch (HibernateException ex) {
					if (transaction != null)
						transaction.rollback();
					ex.printStackTrace();
				} finally {
					session.close();
				}
				return contact;
			}

			public  boolean insertContact(Contact contact) {
				Session session = sessionFactory.openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					session.save(contact);
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

			public boolean deleteContact(int id) {
				Session session = sessionFactory.openSession();
				Transaction transaction = null;
				try {
					transaction = session.beginTransaction();
					Contact contact = (Contact) session.get(Contact.class, id);
					session.delete(contact);
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
