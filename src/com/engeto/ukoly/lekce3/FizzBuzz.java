package com.engeto.ukoly.lekce3;

public class FizzBuzz {
    public static void main(String[] args) {
        //Nevím který z těchto dvou je lepší, jestli ten kde určíme uvnitř proměnnou a nebo ten, dke duplikujeme kód println
        for (int i = 0; i < 100; i++) {
            int updatedInt=i+1;
            if (updatedInt %3==0){
                System.out.println("Fizz");
            } else if (updatedInt % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(updatedInt);
            }
        }
        System.out.println("=======================================");

        for (int i = 0; i < 100; i++) {
            int updatedInt=i+1;
            String systemOut;
            if (updatedInt %3==0){
                systemOut="Fizz";
            } else if (updatedInt % 5 == 0) {
                systemOut="Buzz";
            }else {
                systemOut=String.valueOf(updatedInt);
            }
            System.out.println(systemOut);
        }
        System.out.println("=======================================");
        //úprava intu ve for cyklu, která způsobu posunutí a tím pádem správné zobrazení čísel od 1-100 Dle mě asi nejlefektivnější, jelikož zde nespecifikuješ žádné proměnné uvnitř.
        for (int i = 1; i < 101; i++) {
            if (i %3==0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
