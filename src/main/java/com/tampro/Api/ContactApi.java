package com.tampro.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tampro.Service.ContactService;
import com.tampro.domain.Contact;

@RestController
public class ContactApi {

	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "getAll-Contact-API",method = RequestMethod.GET)
	public List<Contact> RestContact()
	{
		List<Contact> listContact = contactService.getAllContact();
		return listContact;
	}
	
	@RequestMapping(value="Contact-API" ,method = RequestMethod.GET)
	public Contact Contact( @RequestBody String name) {
		
		return contactService.getContact(name);
	}
	@RequestMapping(value="getContact-API/{id}" ,method = RequestMethod.POST)
	public Contact Contact( @PathVariable int id) {
		
		return contactService.getContactById(id);
	}
	@RequestMapping(value="addContact-API" ,method = RequestMethod.POST)
	public void addContact( @RequestBody Contact contact) {
		
	   contactService.CreateContact(contact);
	  
	}
	@RequestMapping(value="deleteContact-API/{id}" ,method = RequestMethod.POST)
	public void DeleteContact( @PathVariable int  id) {
		
	   contactService.deleteContact(id);
	}
	@RequestMapping(value="UpdateContact-API" ,method = RequestMethod.POST)
	public void updateContact( @RequestBody Contact contact) {
		
	   contactService.updateContact(contact);
	}
	
}
