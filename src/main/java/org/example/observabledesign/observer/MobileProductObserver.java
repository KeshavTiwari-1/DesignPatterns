package org.example.observabledesign.observer;

import org.example.observabledesign.observable.ProductObservable;

public class MobileProductObserver implements ProductObserver{

    private String mobileId;
    private ProductObservable productObservable;

    public MobileProductObserver(String mobileId, ProductObservable productObservable){
        this.mobileId = mobileId;
        this.productObservable = productObservable;
    }

    @Override
    public void update() {
        sendMessage();
    }

    private void sendMessage() {
        System.out.println("Hey " + mobileId + " Product is in stock");
    }
}
