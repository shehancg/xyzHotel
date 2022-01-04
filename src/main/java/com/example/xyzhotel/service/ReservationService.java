package com.example.xyzhotel.service;

import com.example.xyzhotel.model.ReservationObj;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {
    List<ReservationObj> findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(LocalDate checkInDate, LocalDate checkOutDate);
}
