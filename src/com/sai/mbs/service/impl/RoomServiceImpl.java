/**
 * 
 */
package com.sai.mbs.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.sai.mbs.model.Room;
import com.sai.mbs.service.RoomService;

/**
 * @author sv
 *
 */
public class RoomServiceImpl implements RoomService {
	
	List<Room> ROOM_DB;
	
	public RoomServiceImpl() {
		// TODO Auto-generated constructor stub
		ROOM_DB = new ArrayList<>();
	}

//	@Override
//	public void add(Room room) {
//		// TODO Auto-generated method stub
//		initRoom();
//	}

	@Override
	public List<Room> list() {
		// TODO Auto-generated method stub
		initRoom();
		return ROOM_DB;
	}
	
	public void getAllRooms() {
		initRoom();
		for(Room rooms : ROOM_DB) {
			System.out.println(rooms.getName());
		}
	}
	
	public boolean checkRoomExist(Room room) {
		initRoom();
		for(Room rooms : ROOM_DB) {
			if(rooms.getName().equals(room.getName()))
				return true;
		}
		return false;
	}
	
	public void initRoom() {
		Room room1 = new Room(1,"Darbar");
		Room room2 = new Room(2,"Thiruvottriyur");
		Room room3 = new Room(3,"Thiruvallur");
		Room room4 = new Room(4,"Kancheepuram");
		Room room5 = new Room(5,"Chengalpet");
		Room room6 = new Room(6,"Gilli");
		ROOM_DB.add(room1);
		ROOM_DB.add(room2);
		ROOM_DB.add(room3);
		ROOM_DB.add(room4);
		ROOM_DB.add(room5);
		ROOM_DB.add(room6);
	}

}
