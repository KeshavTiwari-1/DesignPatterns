package org.example.designparkinglot.parkingspot;

import org.example.designparkinglot.vehicle.Vehicle;

public interface ParkingSpot {
    String getId();
    String getType();
    Boolean isOccupied();
    Vehicle getVehicle();
    void vacate();
    void allote(Vehicle vehicle);
}
