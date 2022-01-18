package com.example.xyzhotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Test1Dto {

    private int reservationId;
    private Long customerId;
    private String reservationRoomId;
}
