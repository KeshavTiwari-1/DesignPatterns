package org.example.designparkinglot.vehicle;

public class TwoWheelerVehicle implements Vehicle{

    private String id;
    private static final String vehicleType = "TWO_WHEELER";

    public TwoWheelerVehicle(String vehicleId){
        id = vehicleId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }
}
