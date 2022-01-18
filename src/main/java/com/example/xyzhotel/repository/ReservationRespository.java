package com.example.xyzhotel.repository;

import com.example.xyzhotel.model.ReservationDto;
import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.model.RoomTypeObj;
import com.example.xyzhotel.model.Test1Dto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Repository
public interface ReservationRespository extends JpaRepository<ReservationObj,Integer> {
    //return list<ReservationObj>checkin,checkout
    //public List<ReservationObj> findByCheckingDateLessThanEqualAndCheckoutDateGreaterThanEqual(LocalDate checkOutDate,LocalDate checkingDate);
    List<ReservationObj> findByCheckInDateLessThanEqualAndCheckOutDateGreaterThanEqual(LocalDate checkInDate, LocalDate checkOutDate);

    @Query("SELECT new com.example.xyzhotel.model.ReservationDto(r.reservationId, m.roomNo) FROM ReservationObj r JOIN r.reservationRooms m")
    public List<ReservationDto> getJoinInformation();

    @Query("SELECT new com.example.xyzhotel.model.Test1Dto(r.reservationId,r.id, m.roomNo) FROM ReservationObj r JOIN r.reservationRooms m WHERE r.checkInDate<= ?1 AND r.checkOutDate>= ?2")
    public List<Test1Dto> getJoinInformationUsingCheckinandChecAndCheckOutDate(LocalDate checkOutDate, LocalDate checkInDate);

//    @Query("SELECT new com.example.xyzhotel.model.ReservationDto(r.reservationId, r.roomNo) FROM  r ")
//    public List<ReservationDto> getJoinInformationUsingView();

}
