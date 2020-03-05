/**
 * 
 */
package com.sai.mbs.service;

import java.util.List;

import com.sai.mbs.model.Room;

/**
 * @author sv
 *
 */
public interface RoomService {
	
	//public void add(Room room);
	
	public List<Room> list();
	
	public void getAllRooms();
	
	public boolean checkRoomExist(Room room);

}
