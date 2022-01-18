package com.example.xyzhotel.controller.restContoller;

import com.example.xyzhotel.model.ReservationRoomView;
import com.example.xyzhotel.model.ReservedRoomDto;
import com.example.xyzhotel.model.RoomTable;
import com.example.xyzhotel.model.responsehandle.Response;
import com.example.xyzhotel.service.ReservedRoomDtoService;
import com.example.xyzhotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/availableRoom")
public class ReservedRoomViewController {
    @Autowired
    private ReservedRoomDtoService reservedRoomDtoService;

    @Autowired
    private RoomService roomService;

    @GetMapping
    public Response getView(@RequestBody ReservedRoomDto reservationDto){
        List<ReservedRoomDto> reservationRoomViewList = reservedRoomDtoService.reservationListUsingcheckinAndCheckOut(reservationDto.getCheckInDate(),reservationDto.getCheckOutDate());
        return Response.success(reservationRoomViewList);
    }

    @GetMapping(value = "/notin")
    public Response getAvailableRoom(@RequestBody ReservedRoomDto reservationDto){

        List<RoomTable> roomTableList = reservedRoomDtoService.avRoom(reservationDto.getCheckInDate(),reservationDto.getCheckOutDate());
        List<RoomTable> roomTableList2 =roomService.availableRoom(roomTableList);

        return Response.success(roomTableList2);
    }
}
