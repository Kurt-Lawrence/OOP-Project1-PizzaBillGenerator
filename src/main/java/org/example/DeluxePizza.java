package org.example;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeggie) {
        super(isVeggie);

        super.addExtraCheese();
        super.addExtraToppings();

    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}
