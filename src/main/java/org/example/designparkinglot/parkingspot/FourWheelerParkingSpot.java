package org.example.designparkinglot.parkingspot;

import org.example.designparkinglot.vehicle.Vehicle;

public class FourWheelerParkingSpot implements ParkingSpot{
    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public Boolean isOccupied() {
        return null;
    }

    @Override
    public Vehicle getVehicle() {
        return null;
    }

    @Override
    public void vacate() {

    }
}
