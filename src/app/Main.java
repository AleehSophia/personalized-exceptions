package app;

import models.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Room number: ");
        int number = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        Reservation reservation = new Reservation(number, checkIn, checkOut);
        System.out.print("Reservation: " + reservation);

        System.out.println();
        System.out.print("Enter data to update the reservation:");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.next());

        reservation.updateDates(checkIn, checkOut);
        System.out.println("Reservation:" + reservation);

        sc.close();
    }
}