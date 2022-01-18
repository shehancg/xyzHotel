package com.example.xyzhotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;


//@NamedStoredProcedureQueries(name ="ReservationDto.test1",procedureName="test",parameters={
//        @StoredProcedureParameter(mode= ParameterMode.IN,name="id",type = Integer.class)
//})
//@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="test1",procedureName="test",parameters={@StoredProcedureParameter(mode= ParameterMode.IN,name="id",type = Integer.class)})})
@Data
@AllArgsConstructor
@ToString
public class ReservationDto {

    private int reservationId;
    private String reservationRoomId;




}
