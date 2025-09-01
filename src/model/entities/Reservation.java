package model.entities;

import java.time.LocalDate;

public class Reservation {

    public Integer roomNumber;
    public LocalDate checkIn;
    public LocalDate checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

}
