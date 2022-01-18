package com.example.xyzhotel.controller.restContoller;

import com.example.xyzhotel.model.ReservationDto;
import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.model.Test1Dto;
import com.example.xyzhotel.model.responsehandle.Response;
import com.example.xyzhotel.repository.ReservationRespository;
import com.example.xyzhotel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/list")
    public Response list(ReservationObj reservationObj, Model model)
    {
        try{
            List<ReservationObj> reservationObjList= reservationService.findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(reservationObj.getCheckInDate(),reservationObj.getCheckOutDate());
            return Response.success(reservationObj);
        } catch (Exception e) {
            return Response.fail(e);
        }

    }

    @PostMapping("/reservationsave")
    public synchronized Response save(@RequestBody ReservationObj reservationObj)
    {
        try
        {
            reservationObj=reservationService.save(reservationObj);
            return Response.success(reservationObj);
        }catch(Exception e) {
            return Response.fail(e);
        }
    }

    @GetMapping("/rList")
    public Response findAll()
    {
        List<ReservationDto> reservationDtoList = reservationService.reservationList();
        return Response.success(reservationDtoList);
    }

    @PostMapping("/xList")
    public Response findAllUsingCheckinAndcheckout(@RequestBody ReservationObj reservationObj)
    {
        List<Test1Dto> test1DtoList = reservationService.reservationListUsingcheckinAndCheckOut(reservationObj.getCheckInDate(),reservationObj.getCheckOutDate());
        return Response.success(test1DtoList);
    }
}
