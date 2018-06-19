package com.Nikhil;

import java.sql.SQLOutput;

public class DeluxeBurger extends HamBurger{

    private boolean chips;
    private String drink;
    private int basePrice;




    public DeluxeBurger(String customerName,BreadType breadType,MeatType meatType,int price,boolean chips,String drink){

        super(customerName,breadType, meatType,price);
        this.chips=chips;
        this.drink = drink; // assuming we have the drink
        this.basePrice=price;

    }

    @Override
    public void showDetails() {

        System.out.println("Customer is " + super.getCustomerName());
        System.out.println("combo price is " + this.basePrice);
        System.out.println("chips:" + Boolean.toString(this.chips)+
        " and drink is " + this.drink);

    }

    public void setAdditions() {

        super.setAdditions(new Additions()); // TRYING  to restrict additions, this means no additions, think so
    }
}
