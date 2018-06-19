package com.Nikhil;

public class HealthyBurger extends HamBurger {

    private Additions additions;// separate filed in this calls for additions

    public HealthyBurger(String customerName, MeatType meatType, int price){

        super(customerName,new BreadType("brown rye bread roll"),meatType,price); // remember the argument type

    }

    @Override
    public void setAdditions(Additions additions) {
        this.additions = additions;
    }
    @Override
    public void showDetails(){
        if (this.additions.getTotalAdditions() >6 ){ //this validation can be removed as all challenge conditions are being met
            System.out.println("Number of additions exceeded, reduce the additions");
        }else {
            System.out.println("Customer is " + getCustomerName());
            System.out.println("Base price is " + getBasePrice());
            System.out.println("price of each addition = " + 10);
            System.out.println("total number of additions " + this.additions.getTotalAdditions());
            System.out.println("Name of the additions are " + this.additions.nameofAdditions());
            System.out.println("addition price is " + this.additions.getCostOfAddition());
            System.out.println("total cost : " + (getBasePrice() + this.additions.getCostOfAddition()));
        }

    }
}
