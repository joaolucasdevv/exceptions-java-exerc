package model.entities;

import java.time.LocalDate;

public class Reservation {

    public Integer roomNumber;
    public LocalDate checkin;
    public LocalDate checkout;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

}
