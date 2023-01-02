package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImp implements ContactService {
	
	List<Contact> list;

	public ContactServiceImp() {
		list = new ArrayList<>();
		list.add(new Contact(1L, "asim@gmail.com", "Asim", 3141L));
		list.add(new Contact(2L, "mahesh@gmail.com", "Mahesh", 3142L));
		list.add(new Contact(3L, "lalit@gmail.com", "Lalit", 3143L));
		list.add(new Contact(4L, "steve@gmail.com", "Steve", 3144L));
		list.add(new Contact(5L, "abhishek@gmail.com", "Abhishek", 3145L));
		list.add(new Contact(6L, "anand@gmail.com", "Anand", 3146L));
	}

	public List<Contact> getContactsOfUser(Long userId) {

		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
