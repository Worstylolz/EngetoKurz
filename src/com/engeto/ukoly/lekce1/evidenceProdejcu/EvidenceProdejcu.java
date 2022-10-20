package com.engeto.ukoly.lekce1.evidenceProdejcu;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EvidenceProdejcu {
    public static void main(String[] args) {
        String jmeno;
        String prijmeni;
        LocalDate datumNarozeni;
        int pocetSjednanychSmluv;
        String nazevMesta;
        String registracniZnacka;
        BigDecimal spotrebaVozuNa100Km;
        String ipV4;

        jmeno="Pepík";
        prijmeni="Vomáčka";
        datumNarozeni= LocalDate.of(1973,3,27);
        pocetSjednanychSmluv=20;
        nazevMesta="Louny";
        registracniZnacka="PHA-7553";
        spotrebaVozuNa100Km=BigDecimal.valueOf(4.5);
        ipV4="197.177.0.1";

        System.out.println("Jméno a příjmení:"+jmeno+" "+prijmeni+"\nDatum narození:"+datumNarozeni+"\nPočet sjednaných smluv:"+pocetSjednanychSmluv+"\nNázev města:"+nazevMesta+"\nRegistrační značka:"+registracniZnacka+"\nSpotřeba vozu na 100km:"+spotrebaVozuNa100Km+"\nIP adresa v4:"+ipV4);
    }
}
