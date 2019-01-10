package com.lhlinh.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhlinh.app.dao.ContactDAO;
import com.lhlinh.app.entities.Contact;
import com.lhlinh.app.entities.User;


@Service
public class ContactService {
	@Autowired
	private ContactDAO contactDAO;

	public List<Contact> getListContact() {
		return contactDAO.getListContact();
	}
	
	public Contact getContactById(int id) {
		return contactDAO.getContactById(id);
	}
	public boolean insertContact(Contact contact) {
		return contactDAO.insertContact(contact);

	}

	public boolean deleteContact(int id) {
		return contactDAO.deleteContact(id);
	}

}
