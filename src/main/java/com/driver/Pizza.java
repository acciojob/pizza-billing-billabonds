package com.driver;

//public class Pizza {
//
//    private int price;
//    private boolean isVeg;
//    private String bill = "";
//    private boolean isCheeseAdded;
//    private boolean isToppingAdded;
//    private boolean isBillGenerated;
//    private boolean isTakenAway;
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//
//        if(isVeg){
////            System.out.println("Base price of the Pizza:300");
//            price += 300;
//        }
//        else{
////            System.out.println("Base price of the Pizza:400");
//            price += 400;
//        }
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        if(isCheeseAdded == false) {
////            System.out.println("Extra Cheese Added:80");
//            isCheeseAdded = true;
//            price += 80;
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if(isToppingAdded == false) {
//            if (isVeg) {
////                System.out.println("Extra Toppings Added:70");
//                price += 70;
//            } else {
////                System.out.println("Extra Toppings Added:120");
//                price += 120;
//            }
//            isToppingAdded = true;
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
////        System.out.println("Paperbag Added:20");
//        if(isTakenAway == false) {
//            isTakenAway = true;
//            price += 20;
//        }
//    }
//
//    public String getBill(){
//        // your code goes here
//
//        if(isBillGenerated == false) {
//            isBillGenerated = true;
//
//            if(isVeg){
//                this.bill += "Base Price Of The Pizza: 300" + " \n";
//            }
//            else{
//                this.bill += "Base Price Of The Pizza: 400" + "\n";
//            }
//
//            if(isCheeseAdded){
//                this.bill += "Extra Cheese Added: 80" + "\n";
//            }
//
//            if(isToppingAdded){
//                if(isVeg) {
//                    this.bill += "Extra Toppings Added: 70" + "\n";
//                }
//                else{
//                    this.bill += "Extra Toppings Added: 120" + "\n";
//                }
//            }
//
//            if(isTakenAway){
//                this.bill += "Paperbag Added: 20" + "\n";
//            }
//            if(isBillGenerated) {
//                this.bill += "Total Price: " + price + "\n";
//            }
//        }
//        return this.bill;
//    }
//}
public class Pizza {

    //private final int extraCheesePrice;
    private int price;

    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGenerated = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.bill = "";

        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.price = this.price + cheese;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price = this.price + toppings;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){

        if(!isBillGenerated){
            if(isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            if(isExtraToppingsAdded)
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAwayAdded)
                this.bill += "Paperbag Added: "+"20"+"\n";

            this.bill += "Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}