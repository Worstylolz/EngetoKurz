package com.engeto.ukoly.lekce2.Hotel;

import java.time.LocalDate;

public class Guest {
    private String jmeno,prijmeni;
    private LocalDate datumNarozeni;

    public Guest(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

    @Override
    public String toString() {
        return "Jméno a příjmení hosta:"+jmeno+" "+prijmeni+"\nDatum narození:"+datumNarozeni;
    }
}
