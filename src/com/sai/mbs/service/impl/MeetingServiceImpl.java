/**
 * 
 */
package com.sai.mbs.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.sai.mbs.model.Group;
import com.sai.mbs.model.Meeting;
import com.sai.mbs.model.Room;
import com.sai.mbs.model.User;
import com.sai.mbs.service.MeetingService;

/**
 * @author sv
 *
 */
public class MeetingServiceImpl implements MeetingService {
	
	List<Meeting> MEETING_DB;
	
	public MeetingServiceImpl() {
		// TODO Auto-generated constructor stub
		MEETING_DB = new ArrayList<>();
	}

	@Override
	public void add(Meeting meeting) throws ParseException {
		// TODO Auto-generated method stub
		init();
		if(!checkMeetingRoomAvailable(meeting.getStartDate(),meeting.getEndDate(),meeting.getRoom().getName())) {
			MEETING_DB.add(meeting);
			System.out.println("******  Meeting Room Blocked ********");
		}else {
			System.out.println("Meeting Room Blocked by another Team :( Please try to block Other Meeting Room");
		}
	}

	private boolean checkMeetingRoomAvailable(Calendar startDate, Calendar endDate, String room) {
		// TODO Auto-generated method stub
		for(Meeting meetings : MEETING_DB) {
			if(meetings.getStartDate().equals(startDate) && meetings.getEndDate().equals(endDate)
					&& meetings.getRoom().getName().equals(room))
						{
						return true;
					}
		}
		return false;
	}

	@Override
	public List<Meeting> list() {
		// TODO Auto-generated method stub
		return MEETING_DB;
	}
	
	public void init() throws ParseException {
		Group group = new Group(1,"BBSS");
		User user = new User(5,"Lokesh",group);
		Room room = new Room (1,"Darbar");
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm");
		Date start = df.parse("05/03/2020" + " " + "10:00");
		Calendar startTime = (Calendar)Calendar.getInstance();
		startTime.setTime(start);
		Date end = df.parse("05/03/2020" + " " + "11:00");
		Calendar endTime = (Calendar)Calendar.getInstance();
		endTime.setTime(end);
		Meeting meeting = new Meeting();
		meeting.setId(1);
		meeting.setUser(user);
		meeting.setRoom(room);
		meeting.setStartDate(startTime);
		meeting.setEndDate(endTime);
		MEETING_DB.add(meeting);
	}

}
