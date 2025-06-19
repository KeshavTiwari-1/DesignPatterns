package org.example.designpatterns.decoratorpattern.pizzatypes;

import org.example.designpatterns.decoratorpattern.BasePizza;

public class Margherita extends BasePizza {
    private static final int cost = 10;
    
    @Override
    public int cost() {
        return cost;
    }
}
