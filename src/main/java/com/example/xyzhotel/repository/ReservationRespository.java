package com.example.xyzhotel.repository;

import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.model.RoomTypeObj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRespository extends JpaRepository<ReservationObj,Integer> {
    //return list<ReservationObj>checkin,checkout
    //public List<ReservationObj> findByCheckingDateLessThanEqualAndCheckoutDateGreaterThanEqual(LocalDate checkOutDate,LocalDate checkingDate);
    List<ReservationObj> findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(LocalDate checkInDate, LocalDate checkOutDate);


}
