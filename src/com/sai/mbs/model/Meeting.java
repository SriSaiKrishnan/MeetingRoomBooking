/**
 * 
 */
package com.sai.mbs.model;

import java.util.Calendar;

/**
 * @author sv
 *
 */
public class Meeting {
	
	private Integer id;
	private String name;
	private Room room;
	private User user;
	private Calendar startDate;
	private Calendar endDate;
	
	public Meeting() {
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param id
	 * @param name
	 * @param room
	 * @param user
	 * @param startDate
	 * @param endDate
	 */
	public Meeting(Integer id, Room room, User user, Calendar startDate, Calendar endDate) {
		super();
		this.id = id;
		this.room = room;
		this.user = user;
		this.startDate = startDate;
		this.endDate = endDate;
	}



	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the startDate
	 */
	public Calendar getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Calendar getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", room=" + room + ", user=" + user + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}


}
