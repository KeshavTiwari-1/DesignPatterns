package org.example.designpatterns.observabledesign.observable;

import org.example.designpatterns.observabledesign.observer.ProductObserver;

public interface ProductObservable {
    void register(ProductObserver productObserver);
    void deregister(ProductObserver productObserver);
    void update();
}
