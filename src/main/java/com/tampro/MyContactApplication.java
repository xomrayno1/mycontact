package com.tampro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tampro.Service.ContactService;
import com.tampro.domain.Contact;

@SpringBootApplication
public class MyContactApplication  implements CommandLineRunner {

	@Autowired
	ContactService contactService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyContactApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	  	
		contactService.getAllContact().forEach(list -> {
			System.out.println(list.getName());
		});
       
		Contact contact = new Contact();
		contact.setIdContact(13);
		contact.setName("nguyen tam");
		contact.setPhone("123");
		contact.setEmail("xr@gmail.com");
		contactService.updateContact(contact);
		
		
	}

	



}
