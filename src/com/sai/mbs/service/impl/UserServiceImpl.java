/**
 * 
 */
package com.sai.mbs.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sai.mbs.model.Group;
import com.sai.mbs.model.User;
import com.sai.mbs.service.UserService;

/**
 * @author sv
 *
 */
public class UserServiceImpl implements UserService {
	
	static List<User> USER_DB;
	
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		USER_DB =  new ArrayList<>();
	}

//	@Override
//	public void add(User user) {
//		// TODO Auto-generated method stub
//		initUser();
//	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		initUser();
		return USER_DB;
	}
	
	public boolean checkUserExist(User user) {
		initUser();
		for(User users : USER_DB) {
			if(users.getName().equals(user.getName()))
				return true;
		}
		return false;
	}
	
	public static void initUser() {
		Group group1 = new Group(1,"Learn");
		Group group2 = new Group(2,"Mobile");
		Group group3 = new Group(3,"EQPT");
		Group group4 = new Group(4,"Community Engagement");
		User user1 = new User(1,"Sai",group1);
		User user2 = new User(2,"Naveen",group2);
		User user3 = new User(3,"Zakir", group3);
		User user4 = new User(4,"Ariv", group4);
		USER_DB.add(user1);
		USER_DB.add(user2);
		USER_DB.add(user3);
		USER_DB.add(user4);
	}
	
	
}
