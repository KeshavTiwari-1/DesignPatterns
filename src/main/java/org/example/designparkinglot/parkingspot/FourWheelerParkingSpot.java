package org.example.designparkinglot.parkingspot;

import org.example.designparkinglot.vehicle.Vehicle;

import java.util.UUID;

public class FourWheelerParkingSpot implements ParkingSpot{
    private String id;
    private static final String type = "FOUR_WHEELER_PARKING_SPOT";
    private Boolean isOccupied;
    private Vehicle vehicle;

    public FourWheelerParkingSpot() {
        this.id = UUID.randomUUID().toString();
        isOccupied = false;
    }

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
