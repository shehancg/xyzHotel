package com.example.xyzhotel.service;

import com.example.xyzhotel.model.ReservationDto;
import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.model.Test1Dto;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {
    List<ReservationObj> findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(LocalDate checkInDate, LocalDate checkOutDate);

    //SAVE
    public ReservationObj save(ReservationObj reservationObj);

    public List<ReservationDto> reservationList();

    public List<Test1Dto> reservationListUsingcheckinAndCheckOut(LocalDate checkInDate, LocalDate checkOutDate);

}
