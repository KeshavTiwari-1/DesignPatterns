package org.example.designpatterns.decoratorpattern;

import org.example.designpatterns.decoratorpattern.pizzatoppings.ExtraCheese;
import org.example.designpatterns.decoratorpattern.pizzatoppings.Mushrooms;
import org.example.designpatterns.decoratorpattern.pizzatypes.Margherita;

public class Main {
    public static void main(String[] args){
        BasePizza margherita = new Margherita();
        BasePizza extraCheese = new ExtraCheese(margherita);
        BasePizza mushroom = new Mushrooms(extraCheese);

        System.out.println(mushroom.cost());
    }
}
