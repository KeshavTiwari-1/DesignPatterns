package org.example.decoratorpattern.pizzatypes;

import org.example.decoratorpattern.BasePizza;

public class VegDelight extends BasePizza {
    private static final int cost = 20;

    @Override
    public int cost() {
        return cost;
    }
}
