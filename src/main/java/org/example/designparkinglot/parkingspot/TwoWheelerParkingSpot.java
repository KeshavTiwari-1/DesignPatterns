package org.example.designparkinglot.parkingspot;

import org.example.designparkinglot.vehicle.Vehicle;

public class TwoWheelerParkingSpot implements ParkingSpot{

    private String id;
    private static final String type = "TWO_WHEELER_PARKING_SPOT";
    private Boolean isOccupied;
    private Vehicle vehicle;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Boolean isOccupied() {
        return isOccupied;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public void vacate() {
        isOccupied = false;
        vehicle = null;
    }

    @Override
    public void allote(Vehicle vehicle) {
        isOccupied = true;
        this.vehicle = vehicle;
    }
}
