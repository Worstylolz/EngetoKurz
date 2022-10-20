package com.engeto.invoiceLekce1And2;

// refactoring - ,,Automatizovaná změna kódu"

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // proměnná (variable) - musí mít uvedný datový typ
    public static void main(String[] args) {

        Invoice invoice1; // vytvoření prázdné proměnné
        invoice1 = new Invoice("housky",10,0.05,false,BigDecimal.valueOf(2.5),LocalDate.now());
        Invoice invoice2 = new Invoice(invoice1);
        Invoice invoice3;

        invoice3=invoice2;

        invoice1=invoice2;


        int yesspess = 0;
        System.out.println(yesspess);


        // garbage collector


        List<Invoice> invoices = new ArrayList<>();
        invoices.add(
                new Invoice("pohlednice",
                        0.005,
                        BigDecimal.valueOf(20)));
        invoices.add(
                new Invoice("známka na pohlednici",
                        0.005,
                        BigDecimal.valueOf(20)));

    }
//        String item;
//        item=" yespes";
//        item="Cyhli 20 ks";
//        System.out.println(item);
//
//        int quantity;
//        quantity =  2;
//        double weight=1.5;
//        boolean isDiscounted;
//
//        // camelCase ... názvy proměnných a metod
//        //     .... první písmeno malé, každé další slovo začíná velkým
//        // PasalCase ... první písmeno velké, zbytek jako u camelCase
//
//        // periodické číslo ... treba 1/3 ... 0.3333333333
//        // 0.1 ... ve dvojkové soustavě je to periodické číslo.
//
//        BigDecimal pricePerPiece = BigDecimal.valueOf(1400.9);
//        LocalDate date = LocalDate.now();
//        LocalDate startOfJavaAcademy = LocalDate.of(2022,10,13);
//
//        weight = weight + 10;
//        weight +=10;
//        weight++;
//
//        pricePerPiece = pricePerPiece.add(BigDecimal.valueOf(45));
//    }

}
