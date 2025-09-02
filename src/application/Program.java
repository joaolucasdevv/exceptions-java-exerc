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

        sc.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine(), Reservation.DTF);

        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine(), Reservation.DTF);

        if (checkOut.isAfter(checkIn)) {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate newCheckIn = LocalDate.parse(sc.nextLine(), Reservation.DTF);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate newCheckOut = LocalDate.parse(sc.nextLine(), Reservation.DTF);

            if (!newCheckIn.isAfter(checkIn) && newCheckOut.isAfter(checkOut)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            else if (!newCheckOut.isAfter(newCheckIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else {
                reservation.updateDates(newCheckIn, newCheckOut);
                System.out.println("Reservation: " + reservation);
            }
        }
        else {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }

        sc.close();
    }

}
