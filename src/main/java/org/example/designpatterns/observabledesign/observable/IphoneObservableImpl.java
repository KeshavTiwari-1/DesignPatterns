package org.example.designpatterns.observabledesign.observable;

import org.example.designpatterns.observabledesign.observer.ProductObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements ProductObservable{

    private List<ProductObserver> observerList = new ArrayList<>();

    @Override
    public void register(ProductObserver productObserver) {
        observerList.add(productObserver);
    }

    @Override
    public void deregister(ProductObserver productObserver) {
        observerList.remove(productObserver);
    }

    @Override
    public void update() {
        for(ProductObserver productObserver : observerList) {
            productObserver.update();
        }
    }
}
