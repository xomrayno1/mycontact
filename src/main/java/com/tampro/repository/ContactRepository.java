package com.tampro.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tampro.domain.Contact;

@Repository
public interface ContactRepository  extends CrudRepository<Contact, Integer>{

	Contact findById(int id);
	
	Contact findByName(String name);
	
	Contact findByEmail(String Email);
	
	Contact findByPhone(String phone);

	List<Contact> findAll();  // tra ve tat Ca Conctact
}
