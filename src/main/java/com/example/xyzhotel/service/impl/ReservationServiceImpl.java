package com.example.xyzhotel.service.impl;

import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.repository.ReservationRespository;
import com.example.xyzhotel.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRespository reservationRespository;

    @Override
    public List<ReservationObj> findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(LocalDate checkInDate, LocalDate checkOutDate) {
        return reservationRespository.findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(checkInDate,checkOutDate);
    }
}
