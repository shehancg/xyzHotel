package com.example.xyzhotel.service.impl;

import com.example.xyzhotel.model.ReservedRoomDto;
import com.example.xyzhotel.model.RoomTable;
import com.example.xyzhotel.repository.RoomServiceRepository;
import com.example.xyzhotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomServiceRepository roomServiceRepository;

    @Override
    public List<RoomTable> availableRoom(List<RoomTable> reservedRoomDtoList) {
        List<RoomTable> roomTableList =roomServiceRepository.findByRoomNoNotIn(reservedRoomDtoList);
        return roomTableList;
    }
}
