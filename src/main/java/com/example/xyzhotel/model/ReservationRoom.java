package com.example.xyzhotel.model;
import javax.persistence.*;

@Entity
@Table(name = "roomreservation")
public class ReservationRoom {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int resRoomId;

    @Column(nullable = false,length = 20)
    private String roomNo;

    @Column(nullable = false,length = 20)
    private String reservationId;

}
