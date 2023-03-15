package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill = "";
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isBillGenerated;
    private boolean isTakenAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg){
//            System.out.println("Base price of the Pizza:300");
            price += 300;
        }
        else{
//            System.out.println("Base price of the Pizza:400");
            price += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false) {
//            System.out.println("Extra Cheese Added:80");
            isCheeseAdded = true;
            price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false) {
            if (isVeg) {
//                System.out.println("Extra Toppings Added:70");
                price += 70;
            } else {
//                System.out.println("Extra Toppings Added:120");
                price += 120;
            }
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
//        System.out.println("Paperbag Added:20");
        if(isTakenAway == false) {
            isTakenAway = true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated == false) {
            isBillGenerated = true;

            if(isVeg){
                this.bill += "Base price of the Pizza: 300" + " \n";
            }
            else{
                this.bill += "Base price of the Pizza: 400" + "\n";
            }

            if(isCheeseAdded){
                this.bill += "Extra Cheese Added: 80" + "\n";
            }

            if(isToppingAdded){
                if(isVeg) {
                    this.bill += "Extra Toppings Added: 70" + "\n";
                }
                else{
                    this.bill += "Extra Toppings Added: 120" + "\n";
                }
            }

            if(isTakenAway){
                this.bill += "Paperbag Added: 20" + "\n";
            }
            if(isBillGenerated) {
                this.bill += "Total Price: " + price + "\n";
            }
        }
        return this.bill;
    }
}
