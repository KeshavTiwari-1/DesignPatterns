package org.example.observabledesign.store;

import org.example.observabledesign.observable.ProductObservable;

public class IphoneProductStock {
    private int stock;
    private final ProductObservable productObservable;

    public IphoneProductStock(ProductObservable productObservable){
        this.productObservable = productObservable;
    }
    
    public void setStock(int stock){
        if(this.stock == 0 && stock > 0) productObservable.update();
        this.stock = stock;
    }
}
