package com.example.xyzhotel.repository;

import com.example.xyzhotel.model.ReservationRoomView;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ReservationRoomViewRepo extends PagingAndSortingRepository<ReservationRoomView, String> {


}
