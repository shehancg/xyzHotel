package com.example.xyzhotel.repository;

import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.model.RoomTypeObj;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FindRoomRepository extends JpaRepository<ReservationObj,Integer> {
    
}
