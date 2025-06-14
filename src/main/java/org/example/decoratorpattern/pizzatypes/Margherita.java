package org.example.decoratorpattern.pizzatypes;

import org.example.decoratorpattern.BasePizza;

public class Margherita extends BasePizza {
    private static final int cost = 10;
    
    @Override
    public int cost() {
        return cost;
    }
}
