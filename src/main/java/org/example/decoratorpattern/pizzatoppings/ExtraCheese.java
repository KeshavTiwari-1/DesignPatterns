package org.example.decoratorpattern.pizzatoppings;

import org.example.decoratorpattern.BasePizza;

public class ExtraCheese extends BasePizza {

    private static final int cost = 2;
    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + cost;
    }
}
