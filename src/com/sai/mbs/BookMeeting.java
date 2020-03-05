package com.sai.mbs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import com.sai.mbs.model.Meeting;
import com.sai.mbs.model.Room;
import com.sai.mbs.model.User;
import com.sai.mbs.service.MeetingService;
import com.sai.mbs.service.RoomService;
import com.sai.mbs.service.UserService;
import com.sai.mbs.service.impl.MeetingServiceImpl;
import com.sai.mbs.service.impl.RoomServiceImpl;
import com.sai.mbs.service.impl.UserServiceImpl;

/**
 * 
 */

/**
 * @author sv
 *
 */
public class BookMeeting {

	private static UserService userService;
	private static RoomService roomService;
	private static MeetingService meetingService;

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		userService = new UserServiceImpl();
		roomService = new RoomServiceImpl();
		meetingService = new MeetingServiceImpl();
			
//		System.out.println("Display User");
//		System.out.println(userService.list());
//		roomService = new RoomServiceImpl();
//		System.out.println("Display Room");
//		System.out.println(roomService.list());
		
		System.out.println("Enter the Username");
		User user = new User();
		user.setName(scanner.next());
		if(userService.checkUserExist(user)) {
			System.out.println("Hello " + user.getName() +" Welcome to the Meeting Room Booking !!");
			System.out.println("Select the Room you need to Book");
			roomService.getAllRooms();
			System.out.println("Enter the Room Name");
			Room room = new Room();
			room.setName(scanner.next());
			if(roomService.checkRoomExist(room)) {
			Meeting meeting = new Meeting();
			System.out.println("Enter the Start Date in the Format MM/dd/yyyy");
			String startDate=scanner.next();
			System.out.println("Enter the Start Time in the Format hh:mm");
			String time = scanner.next();
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm");
			Date dt = df.parse(startDate + " " + time);
			Calendar startTime = (Calendar)Calendar.getInstance();
			startTime.setTime(dt);
			meeting.setStartDate(startTime);
			System.out.println("Enter the End Date in the Format MM/dd/yyyy");
			String endDate=scanner.next();
			System.out.println("Enter the End Time in the Format hh:mm");
			String endTime = scanner.next();
			Date edt = df.parse(endDate + " " + endTime);
			Calendar endtime = (Calendar)Calendar.getInstance();
			endtime.setTime(edt);
			meeting.setEndDate(endtime);
			meeting.setRoom(room);
			meeting.setUser(user);
			meeting.setId(2);
			meetingService.add(meeting);
			}else {
				System.out.println("Select the Valid Meeting Room :)");
			}
		}else {
			System.out.println("Invalid Username :(");
		}
}
}