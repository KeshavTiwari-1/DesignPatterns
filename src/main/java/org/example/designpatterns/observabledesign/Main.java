package org.example.designpatterns.observabledesign;

import org.example.designpatterns.observabledesign.observable.IphoneObservableImpl;
import org.example.designpatterns.observabledesign.observable.ProductObservable;
import org.example.designpatterns.observabledesign.observer.EmailProductObserver;
import org.example.designpatterns.observabledesign.observer.MobileProductObserver;
import org.example.designpatterns.observabledesign.observer.ProductObserver;
import org.example.designpatterns.observabledesign.store.IphoneProductStock;

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
