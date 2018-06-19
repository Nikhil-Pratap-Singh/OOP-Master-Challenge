package com.Nikhil;

public class Additions {

    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private String addition5;
    private String addition6;

    private int totalAdditionPrice;
    private int totalAdditions;

    public Additions() {

        this.totalAdditions=0;
        this.totalAdditionPrice= 10*this.totalAdditions;


    }

    public Additions(String addition1) {

        this.totalAdditions=1;
        this.totalAdditionPrice= 10*this.totalAdditions;
        this.addition1 = addition1;
    }
    public Additions(String addition1, String addition2) {

        this.totalAdditions=2;
        this.totalAdditionPrice= 10*this.totalAdditions;
        this.addition1 = addition1;
        this.addition2 = addition2;
    }

    public Additions(String addition1, String addition2, String addition3) {

        this.totalAdditions=3;
        this.totalAdditionPrice= 10*this.totalAdditions;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
    }


    public Additions(String addition1, String addition2, String addition3, String addition4) {

        this.totalAdditions=4;
        this.totalAdditionPrice= 10*this.totalAdditions;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

    public Additions(String addition1, String addition2, String addition3, String addition4, String addition5) {
        this.totalAdditions=5;
        this.totalAdditionPrice= 10*this.totalAdditions;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.addition5 = addition5;
    }

    public Additions(String addition1, String addition2, String addition3, String addition4, String addition5, String addition6) {
        this.totalAdditions=6;
        this.totalAdditionPrice= 10*this.totalAdditions;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    public String nameofAdditions() {

        if (totalAdditions == 0) {
            return "No additions were selected";
        } else if (totalAdditions == 1) {
            return this.addition1;
        } else if (totalAdditions == 2) {
            return this.addition1 + " & " + this.addition2;
        } else if (totalAdditions == 3) {
            return this.addition1 + " & " + this.addition2 + " & " + this.addition3;
        } else if (totalAdditions == 4) {
            return this.addition1 + " & " + this.addition2 + " & " + this.addition3 + " & " + this.addition4;
        }else if (totalAdditions == 5) {
            return this.addition1 + " & " + this.addition2 + " & " + this.addition3 + " & " + this.addition4
                    + " & " + this.addition5;
        } else if (totalAdditions == 6) {
            return this.addition1 + " & " + this.addition2 + " & " + this.addition3 + " & " + this.addition4
                    + " & " + this.addition5+ " & " + this.addition6;
        } else {
            return "Wrong information: Number of additions exceeded";
        }
    }

    public int getCostOfAddition(){
        return this.totalAdditionPrice; // each of addition of 10 rupees.
    }
    public int getTotalAdditions(){

        return (this.totalAdditions);
    }

}
