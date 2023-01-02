package com.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImp implements UserService {

	List<User> list;
	
	public UserServiceImp() {
		list = new ArrayList<>();
		list.add(new User(3141L, "Asim", "974125898"));
		list.add(new User(3142L, "Mahesh","965412378"));
		list.add(new User(3143L, "Lalit","965412378"));
		list.add(new User(3144L, "Steve","965412378"));
		list.add(new User(3145L, "Abhishek","965412378"));
		list.add(new User(3146L, "Anand","965412378"));
	}
	/*
	 * List<User> list = List.of( new User(1, "Asim Pathan", "9147521457"), new
	 * User(2, "Mahesh Harle", "9312457890"), new User(3, "Akash Sabe",
	 * "9147521458"), new User(4, "Karan Singh", "9157521459") );
	 */

	
	  @Override public User getUser(Long id) {
		return null;
	  
	  // return list.get(id); //return list.get(userId);
	  }
	

	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
	}

	

}
