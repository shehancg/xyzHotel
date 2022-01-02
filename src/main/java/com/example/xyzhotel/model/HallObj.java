package com.example.xyzhotel.model;
import javax.persistence.*;

@Entity
@Table(name = "halltable")
public class HallObj {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int hallId;

    @Column(nullable = false,length = 20)
    private String hallName;

    @Column(nullable =false, length=20)
    private int hallCapacity;

    @Column(nullable = false, length=20)
    private int price;

    @Column(nullable =false, length=250)
    private String description;
}
