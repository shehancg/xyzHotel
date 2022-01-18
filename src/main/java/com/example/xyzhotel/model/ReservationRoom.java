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

//    @ManyToOne(targetEntity = ReservationObj.class,cascade=CascadeType.ALL)
//    @JoinColumn(name="reservationId",referencedColumnName = "reservationId", nullable = false)
//    private ReservationObj reservationObj;


    public int getResRoomId() {
        return resRoomId;
    }

    public void setResRoomId(int resRoomId) {
        this.resRoomId = resRoomId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }
}
