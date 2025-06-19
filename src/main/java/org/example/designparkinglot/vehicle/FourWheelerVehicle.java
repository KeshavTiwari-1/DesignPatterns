package org.example.designparkinglot.vehicle;

public class FourWheelerVehicle implements Vehicle{

    private String id;
    private static final String vehicleType = "FOUR_WHEELER";

    public FourWheelerVehicle(String vehicleId) {
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
