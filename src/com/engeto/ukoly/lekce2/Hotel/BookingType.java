package com.engeto.ukoly.lekce2.Hotel;

public enum BookingType {
    WORKING("pracovní"), HOLIDAY("rekreační pobyt");
    public final String label;

    BookingType(String label) {
        this.label = label;
    }
}

