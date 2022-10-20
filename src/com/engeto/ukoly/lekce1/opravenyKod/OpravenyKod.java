package com.engeto.ukoly.lekce1.opravenyKod;

import java.math.BigDecimal;

public class OpravenyKod {

        public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {// zde není jasné, jestli má být string a nebo jestli má být int, proto napíšu obě možnosti
        String pocetLekciString = "10";
        int pocetLekciInt =10;
        System.out.println(pocetLekciString+"\n"+pocetLekciInt);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.valueOf(0); // Nastavíme do proměnné hodnotu 0
        double myWay=0;//Přidal jsem ještě řešení, které jsem praktikoval v jednom projektu, když jsem ještě nevěděl o Bigdecimal, které je pro mě teď paradoxně nové.
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
            myWay=(Math.round(myWay*100)+(0.1*100))/100;
               // operátor "+=" znamená: přičti ke stávající
               // hodnotě navíc 0.1
        }
        System.out.println(cena);
        System.out.println("myWay="+myWay);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+ velikostKosile+ ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> - použij lomítko na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}