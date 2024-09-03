package org.example;

public class Pizza {
    private double basePrice;
    private double price;
    private boolean isVeggie;

    private double extraCheesePrice = 100;
    private double extraToppingsPrice = 150;
    private double takeAwayPrice = 20;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAway;


    public Pizza(Boolean isVeggie) {
        this.isVeggie = isVeggie;

        if(this.isVeggie){
            this.price = 300;
        }else{
            this.price = 400;
        }

        this.basePrice = this.price;
    }

    public void addExtraCheese(){
        System.out.println("Extra Cheese Added");

        this.price += extraCheesePrice;
        isExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        System.out.println("Extra Toppings Added");

        this.price += extraToppingsPrice;
        isExtraToppingsAdded = true;
    }

    public void takeAway(){
        System.out.println("Take Away Order");

        this.price += takeAwayPrice;
        isTakeAway = true;

    }

    public void getBill(){
//        System.out.println("Summary");
//        System.out.println("Pizza: " + this.basePrice);
//        System.out.println(isExtraCheeseAdded ? "Cheese: " + extraCheesePrice : "");
//        System.out.println(isExtraToppingsAdded ? "Toppings: " + extraToppingsPrice : "");
//        System.out.println(isTakeAway ? "Cheese: " + backpackPrice : "");
//        System.out.println("Total: " + this.price);

        String bill = "---------------------\n";

        bill += "Summary";
        bill +="Pizza: " + this.basePrice + "\n";
        bill +=isExtraCheeseAdded ? "Cheese: " + extraCheesePrice + "\n" : "";
        bill +=isExtraToppingsAdded ? "Toppings: " + extraToppingsPrice  + "\n": "";
        bill +=isTakeAway ? "Cheese: " + takeAwayPrice + "\n": "";
        bill +="Total: " + this.price;

        bill += "\n---------------------\n";

        System.out.println(bill);
    }
}
