package com.example.xyzhotel.service;

import com.example.xyzhotel.model.ReservedRoomDto;
import com.example.xyzhotel.model.RoomTable;

import java.util.List;

public interface RoomService {

    public List<RoomTable> availableRoom(List<RoomTable> reservedRoomDtoList);
}
