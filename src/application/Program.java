package application;

import model.entities.Reservation;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine(), Reservation.DTF);

        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine(), Reservation.DTF);

        if (checkOut.isAfter(checkIn)) {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation" + reservation);
        }
        else {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }







        sc.close();
    }

}
