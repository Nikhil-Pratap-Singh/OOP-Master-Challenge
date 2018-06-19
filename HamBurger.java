package com.Nikhil;

public class HamBurger {

    private BreadType breadType;
    private MeatType meatType;
    private Additions additions;
    private int basePrice;
    private String customerName;



    public HamBurger(String customerName,BreadType breadType, MeatType meatType, int price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.basePrice = price;
        this.customerName = customerName;

    }


    public void showDetails(){
        if (this.additions.getTotalAdditions() >4 ) {
            System.out.println("Number of additions exceeded, reduce the additions");
        }else {
            System.out.println("Customer is " + this.customerName);
            System.out.println("Base price is " + this.basePrice);
            System.out.println("price of each addition = " + 10);
            System.out.println("total number of additions " + this.additions.getTotalAdditions());
            System.out.println("Name of the additions are " + this.additions.nameofAdditions());
            System.out.println("addition price is " + this.additions.getCostOfAddition());
            System.out.println("total cost : " + (this.basePrice + this.additions.getCostOfAddition()));
        }

    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setAdditions(Additions additions) {

        this.additions = additions;
    }
    public int getBasePrice (){
        return this.basePrice;
    }

}
