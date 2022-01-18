package com.example.xyzhotel.service.impl;

import com.example.xyzhotel.model.ReservationRoomView;
import com.example.xyzhotel.repository.ReservationRoomViewRepo;
import com.example.xyzhotel.service.ReservationRoomViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationRoomViewServiceImpl implements ReservationRoomViewService {

    @Autowired
    ReservationRoomViewRepo reservationRoomViewRepo;
    @Override
    public List<ReservationRoomView> findAll() {
        List<ReservationRoomView> reservationRoomViewList= (List<ReservationRoomView>) reservationRoomViewRepo.findAll();
        return reservationRoomViewList;

    }
}
