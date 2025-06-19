package org.example.designpatterns.observabledesign.observer;

import org.example.designpatterns.observabledesign.observable.ProductObservable;

public class EmailProductObserver implements ProductObserver{

    private String emilID;
    private ProductObservable productObservable;

    public EmailProductObserver(String emailID, ProductObservable productObservable){
        this.emilID = emailID;
        this.productObservable = productObservable;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Hey " + emilID + " Product is in stock");
    }
}
