package org.example.observabledesign;

import org.example.observabledesign.observable.IphoneObservableImpl;
import org.example.observabledesign.observable.ProductObservable;
import org.example.observabledesign.observer.EmailProductObserver;
import org.example.observabledesign.observer.MobileProductObserver;
import org.example.observabledesign.observer.ProductObserver;
import org.example.observabledesign.store.IphoneProductStock;

public class Main {
    public static void main(String[] args){
        ProductObservable iphoneObservable = new IphoneObservableImpl();
        IphoneProductStock iphoneProductStock = new IphoneProductStock(iphoneObservable);

        ProductObserver productObserver = new EmailProductObserver("abc@xyz.com", iphoneObservable);
        ProductObserver productObserver1 = new MobileProductObserver("Keshav's Android Phone", iphoneObservable);

        iphoneObservable.register(productObserver);
        iphoneObservable.register(productObserver1);

        iphoneProductStock.setStock(10);
        iphoneProductStock.setStock(20);
        iphoneProductStock.setStock(0);
        iphoneProductStock.setStock(100);

    }
}
