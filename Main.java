package com.Nikhil;

public class Main {

    public static void main(String[] args) {

        BreadType breadType = new BreadType("White");
        MeatType meatType = new MeatType("Beef");

       /* HamBurger hamBurger = new HamBurger("Nikhil",breadType,meatType,100);
        hamBurger.additions = new Additions("lettuce","onion","carrot");   //dont forget to initialise , this when additions is public
        hamBurger.setAdditions(new Additions("onion")); // another way of initialisation via setter
        hamBurger.showDetails();
        hamBurger.setMeatType(new MeatType("pork"));*/
        // like additions there can be customization in bread and meat type

        // remove /* and */ to un-comment

        /*DeluxeBurger deluxeBurger = new DeluxeBurger("Nyk",breadType,meatType,500,true,"pepsi");
        deluxeBurger.showDetails();*/

        HealthyBurger healthyBurger = new HealthyBurger("nikhil",new MeatType("chicken"),400);
        healthyBurger.setAdditions(new Additions("onion","2","3","4","5","6") );
        healthyBurger.showDetails();

        /*points to remmember: initalising fields
        uneccesary use meat and bread class
        took me 2 hourse and 30 minutes :(
         */
    }
}
