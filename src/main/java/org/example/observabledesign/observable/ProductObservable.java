package org.example.observabledesign.observable;

import org.example.observabledesign.observer.ProductObserver;

public interface ProductObservable {
    void register(ProductObserver productObserver);
    void deregister(ProductObserver productObserver);
    void update();
}
