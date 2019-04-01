package com.tampro.Service;

import java.util.List;

import com.tampro.domain.Contact;

public interface ContactService {
	
	Contact CreateContact(Contact contact);
	
	List<Contact> getAllContact();
	
	Contact getContact(String name);
	
	Contact getContactById(int id);
	
	Contact updateContact(Contact contact);
	
	void deleteContact(int id);
	
}
