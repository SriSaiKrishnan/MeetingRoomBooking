/**
 * 
 */
package com.sai.mbs.service;

import java.util.List;

import com.sai.mbs.model.User;

/**
 * @author sv
 *
 */
public interface UserService {
	
	//public void add(User user);
	
	public List<User> list();
	
	public boolean checkUserExist(User user);
	
}
