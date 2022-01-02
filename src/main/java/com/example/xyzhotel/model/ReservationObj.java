package com.example.xyzhotel.model;
import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "reservation")
public class ReservationObj {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int reservationId;

    @Column(nullable = false,length = 20)
    private int resTypeId;

    @Column(nullable =false,length=20)
    private Long id;

    @Column(nullable =false)
    private LocalDate checkInDate;

    @Column(nullable =false)
    private LocalDate checkOutDate;

    @Column(nullable =false,length=2)
    private boolean isActive;

    @Column(nullable =false,length=10)
    private int noOfGuest;
}
