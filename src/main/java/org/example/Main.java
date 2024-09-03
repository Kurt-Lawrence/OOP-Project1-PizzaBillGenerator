package org.example;


public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza(false);
        pizza1.addExtraToppings();



        pizza1.getBill();

        DeluxePizza pizzaDP1 = new DeluxePizza(false);
        pizzaDP1.addExtraCheese();
        pizzaDP1.addExtraToppings();
        pizzaDP1.getBill();
    }


}