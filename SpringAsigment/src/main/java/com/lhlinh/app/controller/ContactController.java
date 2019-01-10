package com.lhlinh.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lhlinh.app.entities.Contact;
import com.lhlinh.app.entities.User;
import com.lhlinh.app.services.ContactService;
import com.lhlinh.app.services.UserService;

@RestController
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value = "contact/getall", method = RequestMethod.GET)
	public List<Contact> getListContacts() {
		return contactService.getListContact();
	}
	@RequestMapping(value = "contact/{id}", method = RequestMethod.GET)
	public Contact getContactById(@PathVariable("id") int id) {
		return contactService.getContactById(id);
	}
	
	@RequestMapping(value = "contact/insert", method = RequestMethod.POST)
	public boolean insert(@RequestBody Contact contact) {
		return contactService.insertContact(contact);
	}
	
	@RequestMapping(value = "contact/delete/{id}", method = RequestMethod.DELETE)
	public boolean deleteAccount(@PathVariable("id") int id) {
		return contactService.deleteContact(id);
	}
}
