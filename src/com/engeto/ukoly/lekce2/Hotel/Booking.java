package com.engeto.ukoly.lekce2.Hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private HotelRoom room;
    private Guest guest;
    private List<Guest> otherGuests;
    LocalDate from;
    LocalDate to;

    BookingType type;

    //Enum jsem na



    //Původně konstruktor obsahoval dva localDate, pak jsem si uvědomil, že stačí jen počáteční a zbytek dorovnat dny.

    //Rozhodl jsem se pro 4 konstruktory, aby byla možnost přidat pokoj s jedním hostem nebo s dalšími rovnou v konstruktorech. Sice by to bylo možné i rovnou po vytvoření instance, ačkoliv nevím, jestli by jsi chtěl vytvořit v realu pokoj v systému a teprve potom tam přídavat další hosty, to asi nedává smysl.
    //Dále jsem chtěl zajistit, ať je vždy v rezervaci povinný alespoň jeden host.
    public Booking(HotelRoom room, Guest guest, LocalDate from, int days, BookingType type) {
        this.room = room;
        this.guest = guest;
        this.from = from;
        this.to = from.plusDays(days);
        this.type=type;
    }

    public Booking(HotelRoom room, Guest guest, List<Guest> otherGuests, LocalDate from, int days, BookingType type) {
        this.room = room;
        this.guest = guest;
        this.otherGuests = otherGuests;
        this.from = from;
        this.to=from.plusDays(days);
        this.type=type;
    }

    public Booking(HotelRoom room, Guest guest, List<Guest> otherGuests, int days, BookingType type) {
        this(room,guest,otherGuests,LocalDate.now(),days,type);
    }

    public Booking(HotelRoom room, Guest guest, int days, BookingType type) {
        this(room,guest,LocalDate.now(),days,type);
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    @Override
    public String toString() {
        return "Pokoj:"+getRoom().roomId+" má rezervaci od:"+from+" do:"+to+"\nTyp rezervace: "+type+"\nInformace o hostech:\n"+guest+"\n";
    }
}
