package com.example.xyzhotel.repository;

import com.example.xyzhotel.model.ReservationObj;
import com.example.xyzhotel.model.RoomTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomServiceRepository extends JpaRepository<RoomTable,Integer> {

   public List<RoomTable>  findByRoomNoNotIn(List<RoomTable> roomTableList);
}
