package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {

    //Attributy třídy Invoice:
    //(co o objektech této třídy ukládáme)

    //priváte tyto metody vidí jen samotná třída
    //public vidí všechny třídy, co si vyvolají instanci tohoto objektu
    //pokud nevyplním private nebo public, tak by to třídy ze stejné package měli jako public. To je důležité info
    private String item;
    private int quantity;
    private double weight;
    private boolean isDiscounted;
    private BigDecimal pricePerPiece;
    private LocalDate date;

    ///region Konstruktory

    // Konstrukter vynutí nastavení hodnoty při vytváření objektu:

    public Invoice(String item, int quantity, double weight, boolean isDiscounted, BigDecimal pricePerPiece, LocalDate date) {
        this.item = item;
        this.quantity = quantity;
        this.weight = weight;
        this.isDiscounted = isDiscounted;
        this.pricePerPiece = pricePerPiece;
        this.date = date;
    }

    public Invoice(String item, double weight, boolean isDiscounted, BigDecimal pricePerPiece, LocalDate date) {
        this(item,0,weight,isDiscounted,pricePerPiece,date);
    }

    public Invoice(Invoice invoice) {
        this.item = invoice.getItem();
        this.quantity = invoice.getQuantity();
        this.weight = invoice.getWeight();
        this.isDiscounted = invoice.isDiscounted();
        this.pricePerPiece = invoice.getPricePerPiece();
        this.date = invoice.getDate();
    }

    public Invoice(String item, double weight, BigDecimal pricePerPiece) {
        this(item,1,weight,false,pricePerPiece,LocalDate.now());
    }

    public Invoice() {

    }



    ///region Přístupové metody (gettery a settery)

    //pokus

    ///endregion

    // Hlavička metody
    // - public ... modifikátor přístupu: public|private|protected|tic
    // - návratový typ... datový typ výsledku, který metoda vrátí
    // - název metody (camelCase)
    // - kulaté závorky s parametry (případně s parametry)
    // - složené závorky: popis, co se má stát
    public String getItem() {
        return item;
    }

    public void setItem(String newItemDescription) {
        item = newItemDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public BigDecimal getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(BigDecimal pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalWeight(){
        return getWeight()*getQuantity(); //lehcí na debug,jelikož mám hodnoty zapouzdřený takže případný úpravy stačí udělat jen tam.
//        return weight*quantity;// rychlejší na procesor
    }
}
