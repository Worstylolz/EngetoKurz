package com.engeto.ukoly.lekce2.Hotel;

import java.math.BigDecimal;

public class HotelRoom {
    int roomId,numberOfBeds;
    boolean balcony,seaView;
    BigDecimal priceForNight;


    public HotelRoom(int roomId, int numberOfBeds, boolean balcony, boolean seaView, BigDecimal priceForNight) {
        this.roomId = roomId;
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.priceForNight = priceForNight;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomId=" + roomId +
                ", numberOfBeds=" + numberOfBeds +
                ", balcony=" + balcony +
                ", seaView=" + seaView +
                ", priceForNight=" + priceForNight +
                '}';
    }
}
