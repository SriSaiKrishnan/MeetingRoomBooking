package com.sai.mbs.service;

import java.util.List;

import com.sai.mbs.model.Group;

public interface GroupService {
	
	public void add(Group group);
	
	public List<Group> list();

}
