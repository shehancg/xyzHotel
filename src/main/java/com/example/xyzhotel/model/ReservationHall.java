package com.example.xyzhotel.model;
import javax.persistence.*;

@Entity
@Table(name = "hallreservation")
public class ReservationHall {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int hallreservationId;

    @Column(nullable = false,length = 20)
    private String hallId;

    @Column(nullable = false,length = 20)
    private String reservationId;
}
