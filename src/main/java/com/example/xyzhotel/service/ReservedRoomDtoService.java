package com.example.xyzhotel.service;

import com.example.xyzhotel.model.ReservedRoomDto;
import com.example.xyzhotel.model.RoomTable;
import com.example.xyzhotel.repository.ReservedRoomDtoRepo;

import java.time.LocalDate;
import java.util.List;

public interface ReservedRoomDtoService {

    public List<ReservedRoomDto> reservationListUsingcheckinAndCheckOut(LocalDate checkInDate, LocalDate checkOutDate);

    public List<RoomTable> avRoom(LocalDate checkInDate, LocalDate checkOutDate);
}
