package com.engeto.ukoly.lekce2.Hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Guest malikova = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest dvoracek = new Guest("Jan","Dvořáček", LocalDate.of(1995,5,5));
        System.out.println("Vytvoření uživatelé:\n"+malikova+"\n"+dvoracek);
        HotelRoom room1 = new HotelRoom(1,1,true,true, BigDecimal.valueOf(1000));
        HotelRoom room2 = new HotelRoom(2,1,true,true, BigDecimal.valueOf(1000));
        HotelRoom room3 = new HotelRoom(3,3,false,true, BigDecimal.valueOf(2400));
        List<Booking> bookings = new ArrayList<>();
        //rezevace pro Adélu
        bookings.add( new Booking(room1,malikova,LocalDate.of(2021,7,19),7, BookingType.WORKING));
        List<Guest> otherGuestToBooking2= new ArrayList<>();
        otherGuestToBooking2.add(dvoracek);
        //Rezervace pro oba.
        bookings.add(new Booking(room3,malikova,otherGuestToBooking2,LocalDate.of(2021,9,1),14, BookingType.HOLIDAY));

        //výpis všech rezervací
        System.out.println(bookings);
        //vyzkoušení druhé rezervace na jeden pokoj.
        bookings.add( new Booking(room1,dvoracek,LocalDate.of(2021,8,19),7, BookingType.WORKING));
        System.out.println(bookings);
    }

}
