package com.tampro.Service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tampro.Service.ContactService;
import com.tampro.domain.Contact;
import com.tampro.repository.ContactRepository;

@Service
public class ContactServiceImpl  implements ContactService{

	@Autowired
	ContactRepository contactRepository;
	
	private static final Logger LOG = LoggerFactory.getLogger(ContactService.class);
	
	@Override
	public Contact CreateContact(Contact contact) {
		
		Contact localContact = contactRepository.findByPhone(contact.getPhone());
		if(localContact !=null) //da co trong csdl 
		{
			LOG.info("Contact with Phone {} already exist . Nothing will be done,",contact.getPhone());
		}
		else//chua ton tai
 		{
			localContact = contactRepository.save(contact);
		}		
		return localContact;
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> list = contactRepository.findAll();
		return list;
	}

	@Override
	public Contact getContact(String name) {
		// TODO Auto-generated method stub
		return contactRepository.findByName(name);
	}

	@Override
	public Contact updateContact(Contact contact) { // lay id contact
		Contact localContact = contactRepository.findById(contact.getId());
		localContact.setEmail(contact.getEmail());
		localContact.setName(contact.getName());
		localContact.setPhone(contact.getPhone());
		contactRepository.save(localContact);
		return localContact;
	}

	@Override
	public void deleteContact(int id) {
		contactRepository.deleteById(id);
	}

	@Override
	public Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}

	
	
}
