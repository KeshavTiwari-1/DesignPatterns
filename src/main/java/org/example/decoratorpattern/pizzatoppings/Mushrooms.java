package org.example.decoratorpattern.pizzatoppings;

import org.example.decoratorpattern.BasePizza;

public class Mushrooms extends BasePizza {

    private static final int cost = 3;
    private BasePizza basePizza;

    public Mushrooms(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + cost;
    }
}
