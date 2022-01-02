package com.example.xyzhotel.model;
import javax.persistence.*;

@Entity
@Table(name = "roomtable")
public class RoomTable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int roomNo;

    @Column(nullable = false,length = 20)
    private String roomTypeId;

    @Column(nullable =false,length=2)
    private boolean isReserved;

}
