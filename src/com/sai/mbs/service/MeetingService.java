/**
 * 
 */
package com.sai.mbs.service;

import java.text.ParseException;
import java.util.List;

import com.sai.mbs.model.Meeting;

/**
 * @author sv
 *
 */
public interface MeetingService {

	public void add(Meeting meeting) throws ParseException;
	
	public List<Meeting> list();
}
