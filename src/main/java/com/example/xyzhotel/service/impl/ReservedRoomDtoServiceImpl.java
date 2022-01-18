package com.example.xyzhotel.service.impl;

import com.example.xyzhotel.model.*;
import com.example.xyzhotel.repository.ReservedRoomDtoRepo;
import com.example.xyzhotel.service.ReservationRoomViewService;
import com.example.xyzhotel.service.ReservedRoomDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservedRoomDtoServiceImpl implements ReservedRoomDtoService {

    @Autowired
    private ReservedRoomDtoRepo reservedRoomDtoRepo;


    @Override
    public List<ReservedRoomDto> reservationListUsingcheckinAndCheckOut(LocalDate checkInDate, LocalDate checkOutDate) {
        List<ReservedRoomDto> reservedRoomDtos = reservedRoomDtoRepo.findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(checkOutDate,checkInDate);
        return reservedRoomDtos;
    }

    @Override
    public List<RoomTable> avRoom(LocalDate checkInDate, LocalDate checkOutDate) {
        List<ReservedRoomDto> reservedRoomDtos = reservationListUsingcheckinAndCheckOut(checkOutDate,checkInDate);
        List<RoomTable> roomTable = new ArrayList<>();
       // List<Object> objectList = new ArrayList<>();

        for(ReservedRoomDto reservedRoomDto:reservedRoomDtos){
            RoomTable roomTableObj = new RoomTable();
            roomTableObj.setRoomNo(reservedRoomDto.getRoomNo());
            roomTableObj.setRoomTypeId(String.valueOf(reservedRoomDto.getRoomTypeId()));

            roomTable.add(roomTableObj);
           // objectList.add(reservedRoomDto.getRoomNo());
        }
        return roomTable;
    }


}
