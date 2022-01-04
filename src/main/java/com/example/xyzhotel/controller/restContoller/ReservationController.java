package com.example.xyzhotel.controller.restContoller;

import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.repository.ReservationRespository;
import com.example.xyzhotel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {
    @Autowired
    private ReservationRespository reservationRespository;

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/list")
    public String list(ReservationObj reservationObj, Model model)
    {
        try{
            reservationObj= (ReservationObj) reservationService.findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(reservationObj.getCheckInDate(),reservationObj.getCheckOutDate());
            if(reservationObj!=null){
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
