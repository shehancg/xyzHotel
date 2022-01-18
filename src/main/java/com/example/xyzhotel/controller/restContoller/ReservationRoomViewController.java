package com.example.xyzhotel.controller.restContoller;

import com.example.xyzhotel.model.ReservationRoomView;
import com.example.xyzhotel.model.responsehandle.Response;
import com.example.xyzhotel.service.ReservationRoomViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/view")
public class ReservationRoomViewController {
    @Autowired
    private ReservationRoomViewService reservationRoomViewService;
    @GetMapping
    public Response getView(){
        List<ReservationRoomView> reservationRoomViewList = reservationRoomViewService.findAll();
        return Response.success(reservationRoomViewList);
    }
}
