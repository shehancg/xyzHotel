package com.example.xyzhotel.model;
import javax.persistence.*;

@Entity
@Table(name = "reservationtype")
public class ReservationTypeObj {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int resTypeId;

    @Column(nullable = false,length = 20)
    private String resTypeName;

}
