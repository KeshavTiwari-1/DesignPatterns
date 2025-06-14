package org.example.decoratorpattern;

import org.example.decoratorpattern.pizzatoppings.ExtraCheese;
import org.example.decoratorpattern.pizzatoppings.Mushrooms;
import org.example.decoratorpattern.pizzatypes.Margherita;

public class Main {
    public static void main(String[] args){
        BasePizza margherita = new Margherita();
        BasePizza extraCheese = new ExtraCheese(margherita);
        BasePizza mushroom = new Mushrooms(extraCheese);

        System.out.println(mushroom.cost());
    }
}
